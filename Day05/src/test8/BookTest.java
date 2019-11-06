package test8;

public class BookTest {
    public static void main(String[] args) {
        //分别实例化三个对象并赋值
        Book book=new Book("No0004","javaWeb实战2","isbn123127854",25.5f,"2017-01-01");

        Book book1=new Book("No0003","javaWeb实战","isbn1231278",58.8f,"2017-01-01");

        Book book2=new Book("No0005","javaWeb实战3","isbn1231278456",28.3f,"2017-01-01");
        //判断前两个对象
        Book b = book.getPrice()>book1.getPrice()?book:book1;
        //拿最大的与第三个进行比较
        Book max2 = b.getPrice()>book2.getPrice()?b:book2;
        //调用方法
        max2.showBook();
    }
}
