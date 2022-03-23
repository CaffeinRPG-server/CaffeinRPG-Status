package caffein.momineko.status;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashSet;
import java.util.Set;

public class CaffeinStatusType {
    private static final Set<String> statusType = new HashSet<>();

    static void load() {
        FileConfiguration config = StatusCore.getPlugin().getConfig();
        statusType.clear();
        StatusCore.log("Loading -> CaffeinStatusType");
        for (String param : config.getStringList("CaffeinStatusType")) {
            statusType.add(param);
            StatusCore.log("・" + param);
        }
    }

    public static boolean IllegalCheck(String param) {
        return statusType.contains(param);
    }

}
