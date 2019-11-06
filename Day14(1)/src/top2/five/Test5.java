package top2.five;

import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        String sc = scanner.nextLine();
        for (int i = 0; i < sc.length(); i++) {
            char c = sc.charAt(i);
            //大小写
            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90)){
                Test5.countingKey(hashMap,"字母");
            } else if (c >= 48 && c<= 57){
                Test5.countingKey(hashMap,"数字");
            } else if (c == 32){
                Test5.countingKey(hashMap,"空格");
            } else {
                Test5.countingKey(hashMap,"其他");
            }
        }

        System.out.println(hashMap);
                }

public static void countingKey(HashMap<String,Integer> map,String key){
        if (map.get(key) == null){
        map.put(key,1);
        } else {
        Integer count = map.get(key);
        map.put(key,count+1);
        }
        }
        }
