package heima.多态;

public class Sheep extends Animal{
    @Override
    public void cry(String kind) {
        super.cry(kind);
        System.out.println("咩咩咩!");
    }
}
