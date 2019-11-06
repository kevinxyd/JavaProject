package checkpoint3;

import checkpoint3.com.dfbz.bean.Good;
import checkpoint3.com.dfbz.bean.ShoppingCar;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<ShoppingCar> cars = new ArrayList<>();
        ArrayList<Good> goods = new ArrayList<>();
        Good good1 = new Good("001", "少林核桃", "斤", 15.5);
        Good good2 = new Good("002", "尚康饼干", "包", 14.5);
        Good good3 = new Good("003", "移动硬盘", "个", 345.0);
        Good good4 = new Good("004", "高清无码", "G", 199.0);
        goods.add(good1);
        goods.add(good2);
        goods.add(good3);
        goods.add(good4);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要进行的操作：");
        System.out.println("1：购买商品    2：结算并打印小票    3：退出系统");
        while (true) {
            int num = sc.nextInt();
            if (3 == num) {
                System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");
                break;
            }
            if (2 == num) {
                System.out.println("----------------------------------");
                System.out.println("      欢迎光临  ");
                System.out.println("名称      售价    数量   金额");
                int totalCount = 0;
                double totalPrice = 0.0;
                for (ShoppingCar car : cars) {
                    totalCount += car.getNum();
                    totalPrice += car.getGood().getPrice() * car.getNum();
                    System.out.println(car.toString());
                }
                System.out.println("----------------------------------");
                System.out.println(cars.size() + "项商品");
                System.out.println("共：" + totalCount + "件");
                System.out.println("共计：" + totalPrice + "元");
                cars.clear();
                System.out.println("请输入您要进行的操作：");
                System.out.println("1：购买商品    2：结算并打印小票    3：退出系统");
            }
            if (1 == num) {
                System.out.println("----------------------------------");
                System.out.println("      商品列表  ");
                System.out.println("商品id   名称      单价   计价单位");
                for (Good good : goods) {
                    System.out.println(good.toString());
                }
                System.out.println("----------------------------------");
                System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束");
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    String cmd = scanner.next();
                    if ("end".equalsIgnoreCase(cmd)) {
                        System.out.println("购买结束");
                        System.out.println("请输入您要进行的操作：");
                        System.out.println("1：购买商品    2：结算并打印小票    3：退出系统");
                        break;
                    }
                    String[] sp = cmd.split("-");
                    if (sp.length != 2) {
                        System.out.println("您输入的购买姿势不对，请换个姿势再来一次（输入格式：商品id-购买数量）");
                    } else {
                        String id = sp[0];
                        String count = sp[1];
                        boolean tag = false;
                        ShoppingCar car;
                        for (Good good : goods) {
                            if (id.equals(good.getId())) {
                                //加入购物车
                                car = new ShoppingCar();
                                car.setGood(good);
                                car.setNum(Integer.parseInt(count));
                                cars.add(car);
                                tag = true;
                                break;
                            }
                        }
                        if (!tag) {
                            System.out.println("您输入的商品id不存在，请重新输入");
                        }
                    }
                }

            }
        }
    }

}
