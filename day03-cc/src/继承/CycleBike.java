package 继承;

public class CycleBike extends Bike{
//    private static String brand = "春风";
//
//    private static String color = "蓝色";
//    private int wheel = 2;
//
//    private int seat = 1;
    public CycleBike(){
        super("春风","蓝色");
    }
    @Override
    public void show() {

        System.out.println("自行车");
        System.out.println("商标:"+this.brand);
        System.out.println("颜色:"+this.color);
        System.out.println("座位:"+super.seat);
        System.out.println("轮子:"+super.wheel);
    }
}
