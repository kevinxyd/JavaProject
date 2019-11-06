package eight.business;

import eight.pojo.EGoods;
import eight.pojo.Goods;

import java.util.ArrayList;

public class ShoppingCart {
     public ArrayList<Goods> list = new ArrayList<>();
    //定义addGoods方法,添加商品到list
    public void addGoods(Goods goods){
        list.add(goods);
        System.out.println("加入 "+goods.getProductName()+" 成功");
    }
    //是遍历ArrayList集合中的所有商品 信息并打印
    public void showGoods(ArrayList<Goods> list){
        for (Goods g:list) {
            System.out.println(g.getId()+","+g.getProductName()+","+g.getPrice());
        }
    }
    //是计算ArrayList集合中的所有商品的总价和折后 价格,并输出
    public void total(ArrayList<Goods> list){
        float totalPrice = 0;
        double discountPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            double price = goods.getPrice();
            totalPrice += goods.getPrice();
            if (goods instanceof EGoods){
                price=0.88 * price ;
            }
            //如果不是Egoods电子对象就不打折
            discountPrice += price;
        }

        System.out.println("原 价为："+totalPrice+"元"+"\n"+"折扣价："+discountPrice+"元");
    }

}
