package top3;

import java.io.*;
import java.util.Scanner;

public class Test1 {

    private  static FileInputStream  fileInputStream = null;
    private  static FileOutputStream fileOutputStream = null;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个地址：");
        String str = scanner.next();
        File file = new File(str);
        getAllDirectory(file);
    }

    private static int getAllDirectory(File file) throws IOException {
        File[] files = file.listFiles(pathname -> pathname.getName().endsWith(".java") || pathname.isDirectory());
        int number = 0;
        for (File f:files) {
            if (f.isFile()) {
                number ++;
                fileInputStream = new FileInputStream(f);
                fileOutputStream = new FileOutputStream("e://java//" + f.getName());
                int len;
                while ((len = fileInputStream.read()) != -1) {
                    fileOutputStream.write(len);
                }
            } else {
                getAllDirectory(f);
            }
        }
        assert fileOutputStream != null;
        fileOutputStream.close();
        fileInputStream.close();
        return number;
    }


    /*public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String path = sc.nextLine();
        File file = new File(new File("").getAbsolutePath());
        getFileList(file);

        File targetFile = new File("E:\\work_test\\myJava");
        File[] files = targetFile.listFiles();
        int total = 0;
        for (File f : files) {
            if (f.isFile()) {
                total++;
            }
        }
        System.out.println("总共有" + total + "个");

    }


    private static void getFileList(File dir) {
        File[] files = dir.listFiles(myFile -> myFile.getName().endsWith(".java") || myFile.isDirectory());
        for (File f : files) {
            if (f.isFile()) {
                //下一步，将这个文件，copy到目标文件夹下面
                try {
                    System.out.println("正在copy：" + f);
                    copyFile(f);
                    System.out.println("复制成功");

                } catch (IOException e) {
                    System.err.println("这个copyFile方法出现问题了：" + e.toString());
                }
            } else {
                getFileList(f);
            }
        }
    }

    private static void copyFile(File f) throws IOException {
        String fileName = f.getName();
        //在写之前，先检查文件名在目标文件夹下，是否存在，如果是，文件名重新命名
        File targetDir = new File("E:\\work_test\\myJava\\");
        File[] javaFiles = targetDir.listFiles();
        for (File jf : javaFiles) {
            if (fileName.equals(jf.getName())) {
                //说明找到了一样名字，需要重命名
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                String pre = fileName.substring(0, fileName.lastIndexOf("."));
                fileName = pre + "_" + createRand() + suffix;
            }
        }

        File targetFile = new File("E:\\work_test\\myJava\\" + fileName);
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(targetFile);
        int b;
        while (-1 != (b = fis.read())) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    private static int createRand() {
        //在真正的企业项目，我们用UUID
        return new Random().nextInt(10000) + 1;
    }*/
}
