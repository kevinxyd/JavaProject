package com.eight.two.business;

import com.eight.two.pojo.Product;

import java.util.ArrayList;

public class ProductFunction {
    //遍历商品信息
    public static void selectProduct(ArrayList<Product> list){
        System.out.println("商品id   名称    单价    计价单位");
        for (Product product:list) {
            System.out.println(product.getId() + "   " +product.getPruductName() + "   " + product.getPrice()
                    + "   " + product.getUnit());
        }
    }
    //购买商品
    public static ArrayList<Product> buyProduct(String id, int count,ArrayList<Product> list){
        ArrayList<Product> saveBuyProduct =new ArrayList<>();
        for (Product product:list){
            if (id.equals(product.getId())){
                product.setCount(count);
                saveBuyProduct.add(product);
            }
        }
        return saveBuyProduct;
    }
}
