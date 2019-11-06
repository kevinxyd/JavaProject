package top2.seven;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();

        char[] chars =s.toCharArray();
        for (char c:chars) {
            linkedHashSet.add(c);
        }
        for (Character character:linkedHashSet) {
            System.out.print(character + " ");
        }
    }
}
