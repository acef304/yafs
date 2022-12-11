import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMain {
    static List<String> directories = new ArrayList<>();
    static List<String> files = new ArrayList<>();
    static Map<String, String> filesContent = new HashMap<>();

    static boolean isDir(String path) {
        return directories.contains(path);
    }

    static void addFile(String filename) {
        files.add(filename);
        filesContent.put(filename,"");
    }

    static boolean isFile(String path) {
        return files.contains(path);
    }
}
