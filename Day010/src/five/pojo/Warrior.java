package five.pojo;

import five.service.FightAble;

public class Warrior implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("武器打击");
    }

}
