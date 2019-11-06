package six;

public class Test {
    public static void main(String[] args) {
        Cock cock = new Cock();
        cock.setAge(2);
        cock.setColor("红色");
        cock.eat();
        cock.crow();

        Duck duck = new Duck();
        duck.setAge(1);
        duck.setColor("黑色");
        duck.eat();
        duck.swimMing();
    }
}
