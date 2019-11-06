package checkpoint1;

import java.util.Calendar;

public class Test5 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 500);
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String str = year + "";
        str = str.substring(str.length() - 2);
        System.out.println(str + "年" + mouth + "月" + day + "日");

//        Date date = calendar.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("yy年M月dd日");
//        String strDate = sdf.format(date);
//        System.out.println(strDate);


    }
}
