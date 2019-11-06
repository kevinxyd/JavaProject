package five.pojo;

import five.service.FightAble;

public class Master implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}
