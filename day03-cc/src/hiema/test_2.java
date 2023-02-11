package hiema;

public class test_2 {

    private int fun(int a,int b){
        return a+b;
    }
    private  int  fun(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        test_2 ts = new test_2();

        System.out.println(ts.fun(3,4));
        System.out.println(ts.fun(3,4,5));
    }
}
