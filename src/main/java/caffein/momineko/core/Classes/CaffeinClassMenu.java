package caffein.momineko.core.Classes;

import caffein.momineko.core.Loader.ClassDataCaffeinLoader;
import org.bukkit.entity.Player;

public interface CaffeinClassMenu {

    static void open(Player player) {
        for (CaffeinClass caffeinClass : ClassDataCaffeinLoader.getCaffeinClasses()) {

        }
    }

}
