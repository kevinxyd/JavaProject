package other;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<String> color= new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();

        Collections.addAll(color,"♠","♦","♥","♣");
        Collections.addAll(number, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int count = 1;
        hashMap.put(count++,"大王");
        hashMap.put(count++,"小王");
        for (String cnumber : number ) {
            for (String scolor : color) {
                hashMap.put(count++,(scolor+cnumber));
            }
        }
        Set<Integer> keySet = hashMap.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(keySet);

        Collections.shuffle(list);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dilist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
                Integer no = list.get(i);
                if (no > 51){
                    dilist.add(no);
                } else {
                    if (i % 3 == 0){
                        player1.add(no);
                    } else if (i % 3 == 1){
                        player2.add(no);
                    } else {
                        player3.add(no);
                    }
                }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dilist);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        for (Integer i : player1) {
            String card = hashMap.get(i);
            list1.add(card);
        }
        for (Integer i : player2) {
            String card = hashMap.get(i);
            list2.add(card);
        }
        for (Integer i : player3) {
            String card = hashMap.get(i);
            list3.add(card);
        }
        for (Integer i : dilist) {
            String card = hashMap.get(i);
            list4.add(card);
            System.out.println(card);
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
