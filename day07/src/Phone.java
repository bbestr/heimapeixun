public class Phone {
    private  String brand;
    private  String color;
    private  int price;

    public Phone(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void call(String name){
        System.out.println(this.brand+"手机给"+name+"打电话");

    }
    public void sendMessage(){
        System.out.println(this.brand+"群发短信");
    }
}
