package caffein.momineko.core.Loader;

import caffein.momineko.core.CaffeinCore;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigCaffeinLoader implements CaffeinLoader {

    public static String ClassReqExpFormula;
    public static List<String> ClassIconDecoration;

    public static void load() {
        FileConfiguration config = CaffeinCore.getPlugin().getConfig();
        ClassReqExpFormula = config.getString("ClassReqExpFormula");
        ClassReqExpFormula = config.getString("ClassReqExpFormula");
    }
}
