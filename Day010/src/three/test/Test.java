package three.test;

import three.pojo.Receptionist;
import three.pojo.User;
import three.service.Filter;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user;
        for (int i = 0; i < 50; i++) {
            user = new User();
            user.setId(i);
;           list.add(user);
        }
        Filter filter = u -> { };
        Receptionist receptionist = new Receptionist(filter);
        receptionist.receptUser(list,receptionist);
    }
}
