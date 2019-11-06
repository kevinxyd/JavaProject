package checkpoint2;

public class Test2 {

    public static void main(String[] args) {
//        String str = "Hello";
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            str += i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


        StringBuilder sb = new StringBuilder("Hello");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
