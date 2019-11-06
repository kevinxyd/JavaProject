package top2.eight;

import javax.swing.*;
import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (hashMap.size() < 5){
            System.out.println("请输入一个不重复的名字");
            String name = scanner.next();
            int score = random.nextInt(100) + 1;
            hashMap.put(name,score);
            System.out.println(hashMap);
        }

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        int totalScaore = 0;
        int maxScore = hashMap.get(iterator.next());
        int minScore = hashMap.get(iterator.next());

        for (String key: keySet) {
            int score = hashMap.get(key);
            System.out.println(key + score);
            totalScaore += score;
            maxScore = maxScore > score ? maxScore : score;
            minScore = minScore < score ? minScore : score;
        }
        System.out.println("平均分：" + totalScaore/5);
        System.out.println("总分：" + totalScaore);
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);

    }
}
