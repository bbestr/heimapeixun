public class Test {
    public void calculate(int a,int b, int c){
        c = a*b;
    }
    public static void main(String[] args) {
        Test tt = new Test();
        int c = 10;
        tt.calculate(3,4,c);
        System.out.println(c);
    }
}
