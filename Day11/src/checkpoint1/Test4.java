package checkpoint1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {

    public static void main(String[] args) throws ParseException {
        String birthday = "1995-09-05";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);//按下alt + enter快捷键，抛出异常
        System.out.println(birthdayDate);
    }
}
