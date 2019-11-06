package top3.three;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] fruit = {"苹果","香蕉","西瓜","橘子"};
        HashMap<String, String> hashMap = new HashMap<>();
        while (hashMap.size() < fruit.length){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(random.nextInt(10));
            }
            hashMap.put(stringBuilder.toString(),fruit[hashMap.size()]);
        }
        System.out.println(hashMap);


        System.out.println("请输入商品号");
        String s = scanner.next();
        if (hashMap.get(s) != null){
            System.out.println(s + "-" + hashMap.get(s));
        } else {
            System.out.println("查无此商品");
        }

    }
}
