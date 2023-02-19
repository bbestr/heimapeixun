import java.util.Arrays;
import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        评委打分 p = new 评委打分();
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        double max;
        double min;
        double sum;
        for (int i = 0; i < 6; i++) {
            System.out.println("第"+(i+1)+"个评委打分:");
            scores[i] = sc.nextDouble();
            while(scores[i] < 0 || scores[i] > 100){
                System.out.println("请重新输入0-100间分数");
                System.out.println("第"+(i+1)+"个评委打分:");
                scores[i] = sc.nextDouble();
            }
        }
        max = p.getMax(scores);
        min = p.getMin(scores);
        sum = p.getSum(scores);

        double avg = (sum - max - min) / (scores.length - 2);

        //输出平均分
        System.out.println("选手的最终得分是：" + avg);
    }

    public static double getMax(double[] scores){
        double max = 0;
        for (int i = 0; i < scores.length; i++) {
            max = Math.max(max,scores[i]);
        }
        return max;
    }
    public static double getMin(double[] scores){
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < min){
                min = scores[i];
            }
        }
        return min;
    }
    public static double getSum(double[] scores){
        double sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            sum += scores[i];
        }
        return sum;
    }

}
