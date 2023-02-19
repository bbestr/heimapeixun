package heima.多态;

public class Cat extends Animal{
    @Override
    public void cry(String kind) {
        super.cry(kind);
        System.out.println("喵喵喵!");
    }
}
