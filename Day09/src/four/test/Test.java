package four.test;

import four.service.impl.NewPhone;
import four.service.impl.OldPhone;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMeddage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMeddage();
        newPhone.playGame();
    }
}
