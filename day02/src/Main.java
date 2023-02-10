import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int temp = Math.min(num1, num2);
        int min = Math.min(temp, num3);
        System.out.println("min = "+min);

        int tmp = Math.max(num1, num2);
        int max = Math.max(num3, tmp);

        System.out.println("中间值："+(num1+num2+num3-min-max));
        System.out.println("max="+max);

    }
}