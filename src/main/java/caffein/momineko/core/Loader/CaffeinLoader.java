package caffein.momineko.core.Loader;

import caffein.momineko.core.CaffeinCore;
import caffein.momineko.core.Status.CaffeinStatusType;
import org.bukkit.Bukkit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface CaffeinLoader {

    static List<File> dumpFile(File file) {
        List<File> list = new ArrayList<>();
        File[] files = file.listFiles();
        for (File tmpFile : files) {
            if (!tmpFile.getName().equals(".sync")) {
                if (tmpFile.isDirectory()) {
                    list.addAll(dumpFile(tmpFile));
                } else {
                    list.add(tmpFile);
                }
            }
        }
        return list;
    }

    static void error(File file) {
        CaffeinCore.log("§c" + file.getName() + "の読み込み中にエラーが発生しました。");
    }

    static void load() {
        CaffeinStatusType.load();
        ClassDataCaffeinLoader.load();
        ConfigCaffeinLoader.load();
    }
}
