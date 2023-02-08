import java.util.Scanner;
public class 打分 {
    public static void main(String[] args) {
            /*
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

            1. 创建一个数组, 用来存储6个评委的打分
            2. 键盘录入6个评委的打分, 并存入数组
            3. 求和
            4. 求最大值
            5. 求最小值
            6. 求平均值 (sum - max - min) / 4
     */

//        存储评委打分
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

//        获取总和
        int sum = 0;
        sum = GetSum(arr);
//        获取最大值
        int max = GetMax(arr);
//        获取最小值
        int min = GetMin(arr);

//      求平均
        float avg;
        avg = (sum - max -min)/4;

        System.out.println("总分="+sum);
        System.out.println("最高分="+max);
        System.out.println("最低分="+min);
        System.out.println("平均值="+avg);

    }

    public static int GetSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int GetMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int GetMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
