package checkpoint2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test1 {

    public static void main(String[] args) throws ParseException {
        String birthday = "1995-09-05";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long myTime = sdf.parse(birthday).getTime();
        long currentTime = System.currentTimeMillis();
        long dTime = currentTime - myTime;
        System.out.println(dTime / 1000 / 60 / 60 / 24);


    }

}
