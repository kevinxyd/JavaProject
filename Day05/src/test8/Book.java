package test8;

public class Book {
    private String bid;//图书编号
    private String bname;//图书名称
    private String ISBN;//ISBN编码
    private float price;//价格
    private String Date;//出版日期

    public Book() {
    }

    public Book(String bid, String bname, String ISBN, float price, String date) {
        this.bid = bid;
        this.bname = bname;
        this.ISBN = ISBN;
        this.price = price;
        Date = date;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
    //打印图书信息
    public void showBook(){
        System.out.println("最贵的书是："+bid+","+bname+","+ISBN+","+price+","+Date);
    }
}
