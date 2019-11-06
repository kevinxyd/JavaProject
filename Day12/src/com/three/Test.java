package com.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /**
         * 存放54张的卡牌组
         *
         * **/
        List<String> cards = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        colors.add("♠");

        List<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        for (String color:colors) {
            for (String num: numbers) {
                String card = color + num;
                cards.add(card);
            }
        }

        cards.add("大鬼");
        cards.add("小鬼");

        /***
         * 发牌
         * */
        Collections.shuffle(cards);

        //底牌
        List dpList = new ArrayList();
        List player1 = new ArrayList();
        List player2 = new ArrayList();
        List player3 = new ArrayList();
        for (int i = 0; i < cards.size(); i++) {
            if (i > 50){
                dpList.add(cards.get(i));
            } else {
                if (i % 3 == 0){
                    player1.add(cards.get(i));
                } else if (i % 3 == 1){
                    player2.add(cards.get(i));
                } else if (i % 3 == 2){
                    player3.add(cards.get(i));
                }
            }
        }
        if (!dpList.equals("大鬼")){
            if (player1.contains("大鬼")){
                player1.addAll(dpList);
            } else if (player2.contains("大鬼")){
                player2.addAll(dpList);
            } else if (player3.contains("大鬼")){
                player3.addAll(dpList);
            }
        }
        System.out.println("底牌：" + dpList);
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);
    }
}
