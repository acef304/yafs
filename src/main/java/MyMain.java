import java.util.HashMap;
import java.util.Map;

public class MyMain {
    static Map<String, File> directories = new HashMap<>();
    static Map<String, File> files = new HashMap<>();

    static boolean isDir(String path) {
        return directories.containsKey(path);
    }

    static void addFile(String filename) {
        files.put(filename, new File(new byte[0], (short)0777));
    }

    static boolean isFile(String path) {
        return files.containsKey(path);
    }
}
