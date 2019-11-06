package top2.eight;

import java.util.HashSet;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet =new HashSet<>();
        int sum =0;
        while (true){
            System.out.println("请输入数字：");
            Scanner sc =new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("输入-1结束");
            if (i == -1){
                break;
            } else {
                hashSet.add(i);
            }
        }
        for (Integer integer : hashSet) {
            sum += integer;
        }
        System.out.println("总和：" + sum);
        System.out.println("平均数:" + sum / hashSet.size());
    }
}
