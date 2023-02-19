public class Book {
    private String id;

    private String name;

    private double price;

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void show(){
        System.out.println("编号:"+this.id);
        System.out.println("书名:"+this.name);
        System.out.println("价格:"+this.price);
    }
}
