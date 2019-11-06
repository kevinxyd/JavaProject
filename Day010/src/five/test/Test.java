package five.test;

import five.pojo.Player;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        System.out.println("选择：");
        player.select(sc.nextLine());
        System.out.println("==========");
        System.out.println("选择：");
        player.select(sc.nextLine());
    }
}
