package checkpoint1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

    public static void main(String[] args) {
        Date now = new Date();//获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(now);
        System.out.println(dateStr);

    }

}
