package top2.night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (hashMap.size() < 5){
            System.out.println("请输入书籍信息(格式名称，价格)");
            String book = scanner.nextLine();
            String[] strs = book.split(",");
            hashMap.put(strs[0],Double.valueOf(strs[1]));
        }
        hashMap.remove("C++");
        hashMap.put("Java",38.5);
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s + hashMap.get(s));
        }
        System.out.println("===================");
        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() +"" + entry.getValue());
        }
    }
}
