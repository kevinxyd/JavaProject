package five.pojo;

import five.service.FightAble;

public class Player {
    public FightAble select(String str){
        if (str.equals("法力角色")){
            FightAble fightAble = new FightAble() {
                @Override
                public void specialFight() {
                    System.out.println("法术攻击");
                }
            };
            fightAble.specialFight();
            fightAble.commonFight();
            return fightAble;
        } else {
            FightAble fightAble = new FightAble() {
                @Override
                public void specialFight() {
                    System.out.println("武器攻击");
                }
            };
            fightAble.specialFight();
            fightAble.commonFight();
            return fightAble;
        }
    }
}
