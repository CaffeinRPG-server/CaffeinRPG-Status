package caffein.momineko.core.Command;

import caffein.momineko.core.CaffeinCore;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public interface CaffeinCommandExecutor extends CommandExecutor {
    @Override
    default boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        return command(commandSender, args);
    }

    boolean command(CommandSender sender, String[] args);

    static void register() {
        Map<String, CommandExecutor> executors = new HashMap<>();

        executors.put("CaffeinStatus", new CommandCaffeinStatus());

        for (Map.Entry<String, CommandExecutor> entry : executors.entrySet()) {
            Bukkit.getPluginCommand(entry.getKey()).setExecutor(entry.getValue());
        }
    }
}
