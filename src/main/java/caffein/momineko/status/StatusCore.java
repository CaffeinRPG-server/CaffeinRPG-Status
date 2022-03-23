package caffein.momineko.status;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class StatusCore extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        CaffeinStatusType.load();
    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static void log(String log) {
        StatusCore.getPlugin().getLogger().info(log);
    }

}
