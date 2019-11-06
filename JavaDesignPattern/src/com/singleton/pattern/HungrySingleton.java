package com.singleton.pattern;

public class HungrySingleton {

    /*private  static  final  HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        System.out.println("1ci");
        return instance;
    }*/

    private  static final HungrySingleton instance=null;
    private HungrySingleton(){}
    public static synchronized HungrySingleton getInstance(){
        if (instance==null){
            return new HungrySingleton();
        } else {
            return instance;
        }
    }
}
