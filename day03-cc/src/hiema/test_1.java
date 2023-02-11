package hiema;

public class test_1 {
    int age = 10;
    String name = "tony";

    public void test_1(int age, String name){
        name = name;
        age = age;
        System.out.println("name="+this.name+"age:"+this.age);
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public static void main(String[] args) {
//        new hiema.test_1("dada",13).eat()
        test_1 ts = new test_1();

    }
}
