package eight.test;

import eight.business.ShoppingCart;
import eight.pojo.Fruit;
import eight.pojo.Laptop;
import eight.pojo.Phone;

public class Test {
    public static void main(String[] args) {
        //创建购物车对象
        ShoppingCart shoppingCart = new ShoppingCart();
        //创建笔记本对象
        Laptop laptop = new Laptop("笔记本","g10000",10000);
        //创建手机对象
        Phone phone = new Phone("手机","g10001",5000);
        //创建水果对象
        Fruit fruit = new Fruit("苹果","g20000",50);
        //调用addGoods方法，分别把laptop对象、phone对象、fruit对象作为参数
        System.out.println("======添加商品========");
        shoppingCart.addGoods(laptop);
        shoppingCart.addGoods(phone);
        shoppingCart.addGoods(fruit);
        //调用购物车商品展示方法
        System.out.println("======打印商品========");
        shoppingCart.showGoods(shoppingCart.list);
        //显示购物车中所有商品的价格
        System.out.println("==============");
        shoppingCart.total(shoppingCart.list);
    }
}
