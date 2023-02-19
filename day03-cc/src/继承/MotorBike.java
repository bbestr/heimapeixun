package 继承;

public class MotorBike extends Bike{
    private String dianchi = "南孚电池";

    public final int ad = 23;

    public  MotorBike(){
        super();
    }

    @Override
    public void show() {
        System.out.println("南孚电池");
    }
}
