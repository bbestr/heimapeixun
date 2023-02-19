package heima.多态;

public class Dog extends Animal {
    @Override
    public void cry(String kind) {
        super.cry(kind);
        System.out.println("汪汪汪!");
    }
}
