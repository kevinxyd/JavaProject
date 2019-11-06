package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,"4");
        integerStringHashMap.put(1,"3");
        integerStringHashMap.put(2,"3");
        Set<Integer> integers = integerStringHashMap.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);

        }
        Set<Map.Entry<Integer, String>> entries = integerStringHashMap.entrySet();
        for (Map.Entry<Integer,String> m : entries) {
            System.out.println(m.getKey() + m.getValue());
        }
    }
}
