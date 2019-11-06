package top3.one;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, Map> hashMap1 = new HashMap<>();
        hashMap.put("001","李晨");
        hashMap.put("002","范冰冰");
        hashMap1.put("Java基础班",hashMap);

        hashMap.put("001","马云");
        hashMap.put("002","马化腾");
        hashMap1.put("Java就业班",hashMap);

        Set<String> keySet = hashMap1.keySet();
        for (String s : keySet) {
            String key = s;
            Map<String, String> map =hashMap1.get(key);
            Set<Map.Entry<String, String>> set = map.entrySet();
            Iterator<Map.Entry<String, String>> iterator = set.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();
                System.out.println("班级：" + key + " 编号：" + next.getKey() + " 姓名：" + next.getValue());
            }
        }

    }
}
