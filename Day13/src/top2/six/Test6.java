package top2.six;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        while (hashSet.size()<10){
            Random random =new Random();
            int number = random.nextInt(20) + 1;
            hashSet.add(number);
        }
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
