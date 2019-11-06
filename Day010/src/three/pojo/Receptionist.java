package three.pojo;

import three.service.Filter;

import java.util.ArrayList;

public class Receptionist{
    private Filter filter;

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    //接待用户方法
    public void receptUser(ArrayList<User> list,Receptionist receptionist){

        System.out.println("未分组：");
        for (User u:list) {
            if (u.getId() < 10){
                System.out.print(u.getId() + " - "+null + " ");
            }
        }

        System.out.println();
        System.out.println("已分组：");

        for (User u:list) {
            if (u.getId() < 10){
                System.out.print(u.getId() + " - A ");
            }
            if (u.getId() >= 10 && u.getId() < 20){
                System.out.print(u.getId() + " - v1 ");
            }
            if (u.getId() >=20 && u.getId() < 30){
                System.out.print(u.getId() + " - v2 ");
            } else {
                System.out.print(u.getId() + " - A ");
            }

        }
    }
}
