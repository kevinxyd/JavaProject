import com.pojo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //循环录入三本书
        for (int i = 1; i <= 3; i++) {
            Book book=new Book();
            System.out.println("输入第"+i+"本数的名称");
            book.setName( sc.next());
            System.out.println("输入第"+i+"本数的ISBN编码");
            book.setISBN( sc.next());
            System.out.println("输入第"+i+"本数的价格");
            book.setPrice( sc.nextDouble());
            list.add(book);
        }
        System.out.println("----------------------");
        //遍历所有的书
        for (Book book:list) {
            System.out.println(book.getName()+","+book.getISBN()+","+book.getPrice());
        }
    }
}
