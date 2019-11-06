package four;

public  class C extends B{
    public int numc = 30;
    //重写showB
    public void showA(){
        System.out.println("A类中的numa:"+numa);
    }
    //重写showB
    public void showB(){
        System.out.println("B类中的numb:"+numB);
    }
    //定义showC
    public void showC(){
        System.out.println("C类中的numc:"+numc);
    }
}
