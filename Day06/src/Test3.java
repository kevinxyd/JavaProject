import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i < 5; i++) {
            int number=random.nextInt(10)+1;
            System.out.println(number);
        }
    }
}
