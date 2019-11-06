import com.pojo.Worker;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        Worker w1=new Worker("bz001","黄渤",45);
        Worker w2=new Worker("bz002","孙红雷",48);
        Worker w3=new Worker("bz003","罗志祥",35);

        ArrayList<Worker> list=new ArrayList<>();
        //添加对象到集合
        list.add(w1);
        list.add(w2);
        list.add(w3);

        findMaxAge(list);

    }
    //定义方法，获得workers集合中最大年龄的worker对象，并调用show方法
    public static void findMaxAge(ArrayList<Worker> workers){
        Worker maxAgeWorker=workers.get(0);
        for (Worker worker:workers) {
            if (worker.getAge() > maxAgeWorker.getAge()){
                maxAgeWorker=worker;
            }
        }
        System.out.println("最高年龄worker对象：");
        maxAgeWorker.show();
    }
}
