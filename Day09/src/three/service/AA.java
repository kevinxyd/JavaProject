package three.service;

public interface AA {
    void showA();

    default void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str+" ");
        }
        System.out.println();
    }
    //定义默认show10方法
    default void showB10(){
        show10("BBBB");
    }

    default void showC10(){
        show10("CCCC");
    }
}
