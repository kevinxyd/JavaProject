import java.util.Random;
import java.util.Scanner;

public class Game3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        while (true) {
            print(arr);
            if (!isFinish(arr)) {
                System.out.println("please input:(w:up, s:down, a:left, d:right) stop:表示停止游戏");
                String input = sc.next().toLowerCase();
                if("stop".equalsIgnoreCase(input)){
                    break;
                }
                switch (input) {
                    case "w":
                        moveUp(arr);
                        break;
                    case "s":
                        moveDown(arr);
                        break;
                    case "a":
                        moveLeft(arr);
                        break;
                    case "d":
                        moveRight(arr);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("游戏结束");
                break;
            }
        }
    }


    private static void print(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isFinish(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                if ((arr[i][j] == 0) || (arr[i][j] == arr[i][j + 1])) {
                    return false;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                if ((arr[i][j] == 0) || (arr[i][j] == arr[i + 1][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int makeData() {
        int r = new Random().nextInt(10) + 1; //【1，10】
        if (r >= 5) {
            return 2;
        }
        return 0;
    }

    private static void moveUp(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            //上移
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    for (int k = i + 1; k < n; k++) {
                        if (arr[k][j] != 0) {
                            arr[i][j] = arr[k][j];
                            arr[k][j] = 0;
                            break;
                        }
                    }
                }
            }
            //归并
            for (int i = 0; i < n - 1; i++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    arr[i][j] *= 2;
                    arr[i + 1][j] = 0;
                }
            }
            //产生随机数
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    arr[i][j] += makeData();
                }
            }
        }
    }

    private static void moveDown(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            //下移
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i][j] == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        if (arr[k][j] != 0) {
                            arr[i][j] = arr[k][j];
                            arr[k][j] = 0;
                            break;
                        }
                    }
                }
            }
            //归并
            for (int i = n - 1; i > 0; i--) {
                if (arr[i][j] == arr[i - 1][j]) {
                    arr[i][j] *= 2;
                    arr[i - 1][j] = 0;
                }
            }
            //产生随机数
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    arr[i][j] += makeData();
                }
            }
        }
    }

    private static void moveLeft(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            //左移
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    for (int k = j + 1; k < m; k++) {
                        if (arr[i][k] != 0) {
                            arr[i][j] = arr[i][k];
                            arr[i][k] = 0;
                            break;
                        }
                    }
                }
            }
            //归并
            for (int j = 0; j < m - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    arr[i][j] *= 2;
                    arr[i][j + 1] = 0;
                }
            }
            //产生随机数
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] += makeData();
                }
            }
        }
    }

    private static void moveRight(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            //右移
            for (int j = m - 1; j >= 0; j--) {
                if (arr[i][j] == 0) {
                    for (int k = j - 1; k >= 0; k--) {
                        if (arr[i][k] != 0) {
                            arr[i][j] = arr[i][k];
                            arr[i][k] = 0;
                            break;
                        }
                    }
                }
            }
            //归并
            for (int j = m - 1; j > 0; j--) {
                if (arr[i][j] == arr[i][j - 1]) {
                    arr[i][j] *= 2;
                    arr[i][j - 1] = 0;
                }
            }
            //产生随机数
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] += makeData();
                }
            }
        }
    }

}
