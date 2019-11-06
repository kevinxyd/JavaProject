package top3.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test4 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        //花色
        ArrayList<String> colors = new ArrayList<>();
        //数字
        ArrayList<String> numbers = new ArrayList<>();
        //添加花色和数字
        Collections.addAll(colors, "黑桃", "红桃", "梅花", "方块");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //定义添加编号变量
        int count = 1;
        map.put(count++, "大王");
        map.put(count++, "小王");
        //把牌添加到map中
        for (String s1 : numbers) {
            for (String s2 : colors) {
                String cards = s2 + s1;
                map.put(count++, cards);
            }
        }
        //取出map的key键 编号集合
        Set<Integer> integers = map.keySet();
        //储存在list集合中用来打乱
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(integers);
        Collections.shuffle(list);
        //定义四个集合来放底牌和三个玩家的牌编号
        ArrayList<Integer> dplist = new ArrayList<>();
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        //发牌的编号
        for (int i = 0; i <list.size() ; i++) {
            if (i>50){
                dplist.add(list.get(i));
            }else {
                if (i%3==0){
                    player1.add(list.get(i));
                }else if (i%3==1){
                    player2.add(list.get(i));
                }else if (i%3==2){
                    player3.add(list.get(i));
                }
            }
        }
        //对手牌编号排序
        Collections.sort(dplist);
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //定义四个集合放手牌
        ArrayList<String> dplistcard =new ArrayList<>();
        ArrayList<String> playercard1 =new ArrayList<>();
        ArrayList<String> playercard2 =new ArrayList<>();
        ArrayList<String> playercard3 =new ArrayList<>();
        //根据编号找到手牌
        for (Integer i1:dplist) {
            dplistcard.add(map.get(i1));
        }
        for (Integer i2:player1) {
            playercard1.add(map.get(i2));
        }
        for (Integer i3:player2) {
            playercard2.add(map.get(i3));
        }
        for (Integer i4:player1) {
            playercard3.add(map.get(i4));
        }
        System.out.println("底牌："+dplistcard);
        System.out.println("玩家1："+playercard1);
        System.out.println("玩家2："+playercard2);
        System.out.println("玩家3："+playercard3);
    }

}
