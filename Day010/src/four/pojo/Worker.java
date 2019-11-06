package four.pojo;

import four.service.CompareAble;

public class Worker {
    //挑选苹果
    public Apple pickApple(CompareAble compareAble,Apple a1,Apple a2){

        return compareAble.cpmpare(a1,a2);
    }
}
