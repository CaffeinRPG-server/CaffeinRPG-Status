package caffein.momineko.core.Status;

import caffein.momineko.core.CaffeinCore;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashSet;
import java.util.Set;

public class CaffeinStatusType {
    private static final Set<String> statusType = new HashSet<>();

    public static void load() {
        FileConfiguration config = CaffeinCore.getPlugin().getConfig();
        statusType.clear();
        CaffeinCore.log("Loading -> CaffeinStatusType");
        for (String param : config.getStringList("CaffeinStatusType")) {
            statusType.add(param);
            CaffeinCore.log("・" + param);
        }
    }

    public static boolean IllegalCheck(String param) {
        return statusType.contains(param);
    }

    public static Set<String> values() {
        return statusType;
    }

}