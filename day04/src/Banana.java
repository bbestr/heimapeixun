public class Banana {
    private String shape;

    private String taste;
    private String type;

    public Banana(){

    }

    public Banana(String shape, String taste, String type) {
        this.shape = shape;
        this.taste = taste;
        this.type = type;
    }

    public void advance(){
        System.out.println("相当好吃");
    }
    public void advance(String color){
        System.out.println("颜色"+color+"相当漂亮");
    }
}
