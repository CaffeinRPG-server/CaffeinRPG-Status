package caffein.momineko.core.Loader;

import caffein.momineko.core.CaffeinCore;
import caffein.momineko.core.Classes.CaffeinClass;
import caffein.momineko.core.Status.CaffeinStatus;
import caffein.momineko.core.Status.CaffeinStatusType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassDataCaffeinLoader implements CaffeinLoader {

    private static final Map<String, CaffeinClass> classDataMap = new HashMap<>();

    public static void load() {
        File fileClassData = new File(CaffeinCore.getJavaPlugin().getDataFolder(), "ClassData/");
        if (!fileClassData.exists()) {
            fileClassData.mkdirs();
        }
        for (File file : CaffeinLoader.dumpFile(fileClassData)) {
            CaffeinCore.log("Loading -> CaffeinClassData");
            try {
                FileConfiguration data = YamlConfiguration.loadConfiguration(file);
                String fileName = file.getName().replace(".yml", "");
                CaffeinClass caffeinClass = CaffeinClass.create();
                caffeinClass.setMaterial(Material.getMaterial(data.getString("Material", "BARRIER").toUpperCase()));
                caffeinClass.setDisplay(data.getString("Display"));
                caffeinClass.setLore(data.getStringList("Lore"));
                for (String statusType : CaffeinStatusType.values()) {
                    if (data.isSet(statusType)) {
                        caffeinClass.setStatus(statusType, data.getDouble(statusType));
                    } else if (data.isSet("Increase." + statusType)) {
                        caffeinClass.getIncreaseStatus().setStatus(statusType, data.getDouble(statusType));
                    }
                }
                classDataMap.put(fileName, caffeinClass);
                CaffeinCore.log("・" + caffeinClass.getDisplay() + " <- " + file.getName());
            } catch (Exception e) {
                CaffeinLoader.error(file);
            }
        }
    }

    @Nullable
    public static CaffeinStatus getCaffeinClass(String id) {
        return classDataMap.get(id);
    }

    public static Collection<CaffeinClass> getCaffeinClasses() {
        return classDataMap.values();
    }
}
