package hiema;

import java.util.Random;
import java.util.Scanner;

public class rondo {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        int target = rm.nextInt(101);
        int ans;
        int sum = 0;
        int min = 0,max = 100;
        while(true){
            System.out.println("数字范围为["+min+"-"+max+"]");
            System.out.println("请输入数字:");
            ans = sc.nextInt();
            if(ans < target){
                System.out.println("猜小了!");
                min = ans;
                sum++;
            }
            else if(ans > target){
                System.out.println("猜大了!");
                max = ans;
                sum++;
            }
            else if(ans == target){
                System.out.println("恭喜猜对了  游戏结束");
                sum++;
                System.out.println("你猜了"+sum+"次");
                break;
            }
            else{
                System.out.println("输入有误");
            }
            System.out.println("------------------------------");
        }
    }
}
