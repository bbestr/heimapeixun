package 代码块;

public class CarDemo {

    static {
        int aa = 45;
        System.out.println("我是静态代码块");
    }
    public void run(){
        {
            int temp = 9;
            System.out.println("输出:我是代码块一"+temp);
        }

        int temp = 90;
        {

            System.out.println("输出:我是代码块二"+temp);
        }
    }
}
