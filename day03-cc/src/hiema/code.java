package hiema;

public class code {
    {

        System.out.println("code的构造代码块");
    }

    static {

        System.out.println("code的静态代码块");
    }

    public code(){
        System.out.println("code的构造方法");
    }

    public static void main(String[] args) {
        System.out.println("产生code主方法");
        System.out.println("产生codeblock实例");

        codeblock ck = new codeblock();

        System.out.println("产生code实例");

        code cd = new code();
    }
}
