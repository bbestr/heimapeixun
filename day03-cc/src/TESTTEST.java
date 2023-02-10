public class TESTTEST {
    String name;
    int age;

    int x,y;
    public TESTTEST(){

    }

//    TODO: this  可以解决参数名和变量重名的问题
//    下面等价于
//    public TESTTEST(String name,int age){
//        this.name = name1;
//        this.age = age1;
//        System.out.println("我输出几次!");
//    }
    public TESTTEST(String name1,int age1,int x,int y){
        name = name1;
        age = age1;
        this.x = x;
        this.y = y;
        System.out.println("我输出几次!");
    }

    public static void main(String[] args) {
        TESTTEST ts = new TESTTEST("华硕",17,3,4);
        TESTTEST ts1 = new TESTTEST("hha",12,5,6);
        System.out.println("电脑"+ts.name+"处理器"+ts.age);
        System.out.println(ts.x+ts1.x);
    }
}
