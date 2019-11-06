import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        file.createNewFile();
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个验证码：");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String s:list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("请输入一个验证码：");
        String sc = scanner.next();
        if (list.contains(sc)){
            System.out.println("验证成功");
        } else {
            System.out.println("验证码不正确");
        }

    }
}
