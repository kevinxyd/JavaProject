package top6;

import top6.service.Director;

public class Test {
    public static void main(String[] args) {
        //标准
        invokeDirect(() -> {
            System.out.println("导演拍电影啦！");
        });
        //省略
        invokeDirect(() -> System.out.println("导演拍电影啦！"));
    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
