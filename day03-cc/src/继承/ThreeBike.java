package 继承;

public class ThreeBike extends Bike{

    private int wheel = 3;
    public ThreeBike(){
        super();
        super.wheel = 3;
    }

    @Override
    public void show() {
        System.out.println("论自由"+this.wheel);
    }
}
