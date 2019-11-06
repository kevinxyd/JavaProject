package com.eight.two.test;

import com.eight.two.business.ProductFunction;
import com.eight.two.pojo.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //声明商品对象并添加商品
        ArrayList<Product> list = new ArrayList<>();
        ArrayList<Product> list1 = new ArrayList<>();
        Product product1 = new Product("001","少林核桃",15.5f,"斤");
        Product product2 = new Product("002","尚康饼干",14.5f,"包");
        Product product3 = new Product("003","移动硬盘",345f,"个");
        Product product4 = new Product("004","高清无码",199.0f,"G");
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        System.out.println("            欢迎使用超市购物系统");
        while (true) {
            System.out.println("请输入你想要进行的操作：" + "\n" + "1:购买商品       2:结算并打印小票       3、退出系统");
            int id = sc.nextInt();
            while (true) {
                if (id == 1) {
                    ProductFunction.selectProduct(list);
                    System.out.println("请输入您要购买的的商品项(输入格式：商品id-购买数量)，输入end表示购买结束");
                    String productIdCount = sc.next();
                    //提出id和数量
                    String[] strs = productIdCount.split("-");

                    if (strs.length != 2) {
                        System.out.println("您购买的姿势不对");
                    } else {
                        for (Product product : list) {
                            if (strs[0].equals(product.getId())) {
                                product.setId(product.getPruductName());
                                product.setPrice(product.getPrice());
                                product.setUnit(product.getUnit());
                                product.setCount(Integer.parseInt(strs[1]));
                                list1.add(product);
                            }
                        }
                        //ProductFunction.buyProduct(strs[0], Integer.parseInt(strs[1]),list);
                    }
            } else if (id == 2) {
                //遍历已购买商品
                System.out.println("您购买的商品如下：");
                for (Product product : list1) {
                    System.out.println(product.getId() + product.getPruductName() + product.getPrice() + product.getUnit());
                }
            } else if (id == 3) {
                break;
            }
        }

        }
    }




}
