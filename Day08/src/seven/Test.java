package seven;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setJobNumber("m110");
        manager.setName("老王");
        manager.setPayRoll(10000);
        manager.eat();
        manager.job();

        Cook cook = new Cook();
        cook.setJobNumber("c110");
        cook.setName("小王");
        cook.setPayRoll(6000);
        cook.eat();
        cook.job();
    }
}
