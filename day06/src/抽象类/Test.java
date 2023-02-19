package 抽象类;

public class Test {
    public static void main(String[] args) {
        Shape cl = new Circle(2.3);
        Shape rt = new Rectangle(5,7.6);

        System.out.println(cl.area());
        System.out.println(rt.area());

    }
}
