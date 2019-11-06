import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {
        File file = new File(new File("").getAbsolutePath());
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> total = getTotal(file, map);
        System.out.println(total);
    }

    private static Map<String, Integer> getTotal(File dir, Map<String, Integer> map) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String fileName = f.getName();
                int index = fileName.lastIndexOf(".");
                if (-1 != index) {
                    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
                    if (!map.containsKey(suffix)) {
                        map.put(suffix, 1);
                    } else {
                        Integer count = map.get(suffix);
                        map.put(suffix, ++count);
                    }
                }
            } else {
                //否则是一个目录，开始用递归
                getTotal(f, map);
            }
        }
        return map;
    }

}
