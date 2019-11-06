import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] player={1,1};
        int[] computer={1,1};
        int count=0;
        getProint(player,computer);

        while (true){
            if (player[0] + player[1] == 0){
                System.out.println("玩家获胜");
                break;
            }
            if (computer[0] + computer[1] == 0){
                System.out.println("电脑获胜");
                break;
            }
            if (count % 2 == 0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = (player[a-1]+computer[b-1]) % 10;
                player[a - 1] = c;
                System.out.println("玩家："+player[0]+" "+player[1]);
                System.out.println("电脑："+computer[0]+" "+computer[1]);
            } else {
                int a = new Random().nextInt(2)+1;
                int b = new Random().nextInt(2)+1;
                System.out.println("电脑回合选择：" + a + " " + b);
                int c = (computer[a-1]+player[b-1]) % 10;
                computer[a - 1] = c;
                System.out.println("玩家："+player[0]+" "+player[1]);
                System.out.println("电脑："+computer[0]+" "+computer[1]);
            }
            count++;
        }
    }
    //打印信息
    public static void getProint(int[] computer,int[] player){
        System.out.println("玩家："+player[0]+" "+player[1]);
        System.out.println("电脑："+computer[0]+" "+computer[1]);
    }
}
