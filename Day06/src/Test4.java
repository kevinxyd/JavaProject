import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        //获取索引为3的元素
        String content=list.get(3);
        System.out.println("获取索引为3的元素："+content);
        //修改索引为3的元素
        list.remove(3);
        list.add(3,"唐僧");
        //删除索引为1的元素
        list.remove(1);
        //遍历list
        for (String con:list) {
            System.out.println(con);
        }
    }
}
