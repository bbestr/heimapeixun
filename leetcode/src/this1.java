public class this1 {

    private String name;
    public this1(){
        System.out.println("无参构造方法");
    }
    public this1(String name){
        this();
        this.name= name;
        System.out.println("我是有参数构造方法"+name);
    }

    public static void main(String[] args) {
        this1 s = new this1("best");
    }
}
