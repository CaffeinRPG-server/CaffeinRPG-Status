package caffein.momineko.core.Command;

import caffein.momineko.core.Loader.CaffeinLoader;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandCaffeinStatus implements CaffeinCommandExecutor {

    @Override
    public boolean command(CommandSender sender, String[] args) {
        if (args.length >= 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                sender.sendMessage("§aReload CaffeinStatus...");
                CaffeinLoader.load();
                sender.sendMessage("§aReload Complete!");
            }
        }
        sender.sendMessage("/caffeinStatus <reload>");
        return true;
    }
}
