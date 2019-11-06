package test3;

public class Teacher {
    private String name;//姓名
    private int age;//年龄
    private String content;//讲的内容

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //吃的方法
    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭。。。。");
    }
    //讲的方法
    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"的知识。。。");
    }
}
