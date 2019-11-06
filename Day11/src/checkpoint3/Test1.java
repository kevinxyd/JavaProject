package checkpoint3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

    public static void main(String[] args) throws ParseException {
        String str = "2016-12-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStr = sdf.parse(str);
        sdf.applyPattern("yyyy年MM月dd日");
        String newStr = sdf.format(dateStr);
        System.out.println(newStr);
    }

}
