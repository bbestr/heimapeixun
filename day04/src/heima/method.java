package heima;

public class method {
    public static void main(String[] args) {
        int a = 10;
        int b = 89;
        int ret = add(a,b);
        System.out.println(ret);
        int[] ar = {1,2,3,4,5,67,8,0};
        int max = sout(ar);
        System.out.println("最大值="+max);
    }
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int sout(int[] ar){
        System.out.print("["); int max = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
            if (ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println("]");
        return max;
    }
}
