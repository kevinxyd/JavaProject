package one.test;

import one.service.HandleAble;

public class Test {
    public static void main(String[] args) {

        String str = "23.23456789";
        System.out.println("原数字：" + str);

        ((HandleAble) num -> {
            //取整
            System.out.println("取整后：" + num.split("\\.")[0]);
        }).HandleString(str);

        ((HandleAble) num -> {
            //保留四位小数，不满四位补0
            String result = String.format("%.4f", Double.parseDouble(num));
            System.out.println("保留4位小数后：" + result);
        }).HandleString(str);



    }
}
