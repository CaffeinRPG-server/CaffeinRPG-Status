package caffein.momineko.status;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ExampleOfCaffeinStatus implements CaffeinStatus {

    private final CaffeinStatusContainer caffeinStatusContainer = new CaffeinStatusContainer();

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return caffeinStatusContainer;
    }
}
