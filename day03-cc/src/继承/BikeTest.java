package 继承;

public class BikeTest {
    public static void main(String[] args) {
        CycleBike cb = new CycleBike();
        cb.show();

        MotorBike mb = new MotorBike();
        mb.show();

        ThreeBike tb = new ThreeBike();
        tb.show();
    }
}
