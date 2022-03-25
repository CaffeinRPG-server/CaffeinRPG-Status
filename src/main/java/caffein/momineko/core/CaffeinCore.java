package caffein.momineko.core;

import caffein.momineko.core.Command.CaffeinCommandExecutor;
import caffein.momineko.core.Loader.CaffeinLoader;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class CaffeinCore extends JavaPlugin {

    private static Plugin plugin;
    private static JavaPlugin javaPlugin;

    @Override
    public void onEnable() {
        plugin = this;
        javaPlugin = this;
        saveDefaultConfig();
        CaffeinLoader.load();
        CaffeinCommandExecutor.register();
    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static JavaPlugin getJavaPlugin() {
        return javaPlugin;
    }

    public static void log(String log) {
        CaffeinCore.getPlugin().getLogger().info(log);
    }

}
