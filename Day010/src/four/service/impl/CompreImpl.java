package four.service.impl;

import four.pojo.Apple;
import four.service.CompareAble;

public class CompreImpl implements CompareAble {
    @Override
    public Apple cpmpare(Apple apple,Apple apple2) {
        if (apple.getBig() > apple2.getBig()){
            return apple;
        } else {
            return apple2;
        }
    }
}
