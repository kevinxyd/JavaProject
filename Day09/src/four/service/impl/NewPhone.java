package four.service.impl;

import four.service.Play;

public class NewPhone extends OldPhone implements Play {

    //定义call
    public void call() {
        System.out.println("新手机打电话");
    }

    //定义sendMessage
    public void sendMeddage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
