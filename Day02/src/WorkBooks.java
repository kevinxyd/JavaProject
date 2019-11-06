public class WorkBooks {
    public static void main(String[] args) {
        area();//第一题，长方形面积120，周长20
        byteAnd();//第二题，byte类型b1和b2的和：short类型s1和s2的和为
        add();//第三题 add的值 add2的值 add3的值
        evenOdd();//第四题偶数奇数
        var();//第五题 var1值 var2值
        printOdd();//第六题
        and();
        bad();
        product();
        uotient();
        remainder();//第七题
        test8();//第八题
        test9();//第九题
    }

    //第一题，长方形面积120，周长20
    public static void area() {
        int width = 20;
        int height = 6;//x=26-y,xy=120 26y-y2=120
        System.out.println("-------------------------第一题------------------------------");
        System.out.println("长方形的面积为：" + width * height + ",周长为：" + 2 * (width + height));
    }

    //第二题，byte类型b1和b2的和：short类型s1和s2的和为
    public static void byteAnd() {
        byte b1 = 10;
        byte b2 = 20;
        short s1 = 1000;
        short s2 = 2000;
        System.out.println("-------------------------第二题------------------------------");
        System.out.println("byte类型b1和b2的和为:" + (b1 + b2));
        System.out.println("short类型s1和s2的和为" + (s1 + s2));
    }

    //第三题 add的值 add2的值 add3的值
    public static void add() {
        int a = 100;
        long a1 = 10000;
        long add = a + a1;
        long b1 = 20000;
        float b2 = 200.5f;
        float add2 = b1 + b2;
        int c1 = 3;
        double c2 = 3.3;
        double add3 = c1 + c2;
        System.out.println("-------------------------第三题------------------------------");
        System.out.println("add的值为:" + add);
        System.out.println("add2的值为：" + add2);
        System.out.println("add3的值为：" + add3);
    }

    //第四题偶数奇数
    public static void evenOdd() {
        int a1 = 10;
        int a2 = 11;
        int b1 = 12;
        int b2 = 13;
        System.out.println("-------------------------第四题------------------------------");
        System.out.println("10是偶数？" + (a1 % 2 == 0 ? true : false));
        System.out.println("11是偶数？" + (a2 % 2 == 0 ? true : false));
        System.out.println("12是奇数？" + (b1 % 2 != 0 ? true : false));
        System.out.println("13是奇数？" + (b2 % 2 != 0 ? true : false));
    }

    //第五题 var1值 var2值
    public static void var() {
        float f1 = 12345.01f;
        float f2 = 1234.00f;
        float var1 = (f1 >= f2 ? 12456 : 123456.02f);
        float var2 = var1 + 1024;
        System.out.println("-------------------------第五题------------------------------");
        System.out.println("var1的值：" + var1);
        System.out.println("var2的值：" + var2);
    }

    //第六题 num：
    public static void printOdd() {
        int num = 178;
        String str = num % 2 == 0 ? "是偶数" : "是奇数";
        System.out.println("-------------------------第六题------------------------------");
        System.out.println(num + str);
    }

    //第七题 和差积
    //和
    public static void and() {
        int a = 1;
        int b = 2;
        System.out.println("-------------------------第七题------------------------------");
        System.out.println("a,b的和为" + (a + b));
    }
    //差
    public static void bad(){
        int a = 1;
        int b = 2;
        System.out.println("a,b的差为" + (a - b));
    }

    //积
    public static void product() {
        int a = 1;
        int b = 2;
        System.out.println("a,b的积为" + a * b);
    }

    //商
    public static void uotient() {
        int a = 1;
        int b = 2;
        System.out.println("a,b的商为" + (float)a / b);
    }

    //余
    public static void remainder() {
        int a = 1;
        int b = 2;
        System.out.println("a,b的余数为" + a % b);
    }

    //第八题
    public static void test8() {
        char ch = 'J';
        int a = 106;
        ch = (char) a;

        char ch2 = 'a';//97
        char ch3 = 'B';//66
        ch2 = ch3 -= 1;//65

        double d3 = 19.2;
        int i3 = 3;
        double sum3 = d3 + i3;

        double d4 = 15.5;
        int s4 = 19;
        int mul4 = (int) (d4 * s4);
        System.out.println("-------------------------第八题------------------------------");
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println("sum3的值：" + sum3);
        System.out.println("sum3的整数部分：" + (int) sum3);
        System.out.println("mul4的整数部分：" + mul4);

    }

    //第九题
    public static void test9() {
        int num = 251;
        int page = num % 10 != 0 ? num / 10 + 1 : num / 10;
        System.out.println("-------------------------第九题------------------------------");
        System.out.println(page);
    }
}
