import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMain {
    static Map<String, File> directories = new HashMap<>();
    static List<String> files = new ArrayList<>();
    static Map<String, File> filesContent = new HashMap<>();

    static boolean isDir(String path) {
        return directories.containsKey(path);
    }

    static void addFile(String filename) {
        files.add(filename);
        filesContent.put(filename, new File(new byte[0], (short)0777));
    }

    static boolean isFile(String path) {
        return files.contains(path);
    }
}
