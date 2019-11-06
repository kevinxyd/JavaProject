public class Test8 {

    public static void main(String[] args) {
        String str="javajﬁewjavajﬁowfjavagkljjava";
        System.out.printf(str+"字符中java的数量："+getCount(str,"java"));
    }
    public static int getCount(String str,String ch){
        if (str == null || ch == null || "".equals(str.trim()) || "".equals(ch.trim())){
            return 0;
        }
        int count = 0;
        int index =0;
        while ((index = str.indexOf(ch,index)) != -1){
            index = index + ch.length();
            count++;
        }
        return count;
    }
}