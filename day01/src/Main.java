import java.lang.Math;
import java.util.Scanner;

public class Main {
    /*类构造方法执行顺讯*/
//    public void getname(){
////        String ret = name+"今年七岁了";
////        return ret;
//          System.out.println("hello  我叫亚索!");
//    }
//    public Main(){
//        System.out.println("我在那?");
//    }

    /*重载*/
//    public int area(int a,int b){
//        return a*b;
//    }
//    public double area(double r){
//
//        return Math.PI*r*r;
//    }
  public static void main(String[] args) {
//
//        Main mm = new Main();
//        int a = 3,b = 4;
//
//        double r = 4.55;
//
//        System.out.println("长方形:"+mm.area(a,b));
//
//        System.out.println("圆形:"+mm.area(r));
//        Main mm = new Main();
//        mm.getname();

    /*循环的执行*/
//        System.out.println("Hello world!");
//        int a = 12;
//
//        System.out.println(a);
//
//        a = a+12;
//        System.out.println(a);

//        int[] a = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            a[i] = i*6+8;
//        }
//
//        System.out.println(a);

//        int i = 9,j = 6;
//
//        while(j-->3){
//
//            --i;
//        }
//        System.out.println(i);

//        int m=3,n=6,k=0;
//        while(m<n){
//            ++k;m++;--n;
//        }
//        System.out.println(k);
//        int n=1;
//        int sum = 0;
//        while(n<6){
//            sum += Math.pow(n,2);
//            n++;
//        }
//        System.out.println(sum);

//        int n = 1;
////
////        do{
////            System.out.println(n);
////            n++;
////        }while(n<6);
        int n = 200;
        while(n <= 300){
            int ge = n % 10;
            int shi = n / 10 % 10;
            int bai = n / 100;


            if(ge + shi + bai == 12 & ge * shi * bai == 42){
                System.out.println(n);
                System.out.println(ge);
                System.out.println(shi);
                System.out.println(bai);
                n++;
            }
            n++;

        }

        /*
        * 打印梯形
        * */
//        int ara[];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <4-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < 11-(4-i)*2; z++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int ary[] = {1,2,3};
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(ary[i]);
//        }

//        int n = 30;
////        int[] ary = new int[n];
////
////        n = 60;
////
////        System.out.println(ary.length);
//        char[][] ar = new char[][];
//        char[] ary[] = new char[9][]

//        创建sanner 对象
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("输入身高");
//        double db = sc.nextDouble();
//
//        System.out.println("婚姻状况");
//        boolean bl = sc.nextBoolean();
    }
}