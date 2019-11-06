import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
    private static int playerWinCount = 0;
    private static int computerWinCount = 0;
    private static String[] hsPoint = {"方块", "梅花", "红桃", "黑桃"};
    private static String[] dsPoint = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cardList = getCard();
        while (true) {
            int dValue = guessCard(cardList);//d 表示差值的意思
            System.out.println("请输入你的牌大还是小？");
            String cmd = sc.next();
            if ("大".equals(cmd) && dValue > 0) {
                playerWinCount++;
                System.out.println("恭喜你获胜" + "你目前获胜次数：" + playerWinCount + ",电脑获胜次数：" + computerWinCount);
            } else if ("小".equals(cmd) && dValue < 0) {
                playerWinCount++;
                System.out.println("恭喜你获胜" + "你目前获胜次数：" + playerWinCount + ",电脑获胜次数：" + computerWinCount);
            } else {
                computerWinCount++;
                System.out.println("很遗憾，请再来一次");
            }
            System.out.println("卡牌数量剩余：" + cardList.size());
            System.out.println("--------------------------------");
            if (cardList.isEmpty()) {
                break;
            }
        }

    }

    private static int guessCard(ArrayList<String> cardList) {
        String computerCard = getOneCard(cardList);//电脑先抽取一张
        String playerCard = getOneCard(cardList);//玩家再抽一张
        //System.out.println("偷偷打印：" + computerCard);
        System.out.println("电脑：" + "???");
        System.out.println("玩家：" + playerCard);
        String[] computerHsDs = getHsDs(computerCard);
        int computerScore = getScore(computerHsDs[0], computerHsDs[1]);
        String[] playerHsDs = getHsDs(playerCard);
        int playerScore = getScore(playerHsDs[0], playerHsDs[1]);
        return playerScore - computerScore; // 黑桃5 - 黑桃10  得-5分
    }

    private static void removeCard(ArrayList<String> cardList, String card) {
        cardList.remove(card);
    }

    private static String getOneCard(ArrayList<String> cardList) {
        int i = new Random().nextInt(cardList.size());//一开始的时候，就是new Random().nextInt(52)  【0，51】
        String[] hsDs = getHsDs(cardList.get(i));//假设我抽到的是 黑桃5  getHsDs("黑桃5")
        //得出一张卡牌之后，需要移除卡牌
        removeCard(cardList, hsDs[0] + hsDs[1]);
        return hsDs[0] + hsDs[1];// 黑桃 + 5 --> 黑桃5
    }

    private static String[] getHsDs(String str) {
        //str 是黑桃5
        String[] s = new String[2];
        s[0] = str.substring(0, 2);
        s[1] = str.substring(2);
        return s;
    }

    private static int getScore(String hs, String ds) {
        int score = 0;
        for (int i = 0; i < hsPoint.length; i++) {
            if (hs.equals(hsPoint[i])) {
                score += (13 * (i + 1));
            }
        }
        for (int i = 0; i < dsPoint.length; i++) {
            if (ds.equals(dsPoint[i])) {
                score += (i + 1);
            }
        }
        return score;
    }

    /**
     * 初始化一个52张的扑克牌
     *
     */
    private static ArrayList<String> getCard() {
        ArrayList<String> list = new ArrayList<>();
        String[] hs = {"黑桃", "红桃", "梅花", "方块"};
        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String h : hs) {
            for (String d : ds) {
                list.add(h + d);
            }
        }
        return list;
    }

}
