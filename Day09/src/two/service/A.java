package two.service;

public interface A {
    void showA();

    default void showB() {
        System.out.println("BBBB");
    }
}
