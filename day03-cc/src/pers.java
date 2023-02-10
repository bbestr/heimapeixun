import javax.crypto.spec.PSource;

public class pers {
    public static String name;
    private static int age;

    private static String grade;

    public pers(){

    }
    public pers(String name,int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void fun1(){
        System.out.println("我叫夏明");
    }
    public void fun2(int age){
        System.out.println("我今年"+age+"岁");
    }

    public void fun3(){
        System.out.println("我叫"+this.name+"今年"+this.age+"读"+this.grade+"年级");
    }

}
