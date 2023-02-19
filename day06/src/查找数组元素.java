import java.util.Scanner;

public class 查找数组元素 {
    public static void main(String[] args) {
        查找数组元素 c = new 查找数组元素();
        int[] nums = {1,2,3,4,5,6,7,8,9,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入目标值:");
        int target = sc.nextInt();

        int ret = c.search(nums,target);

        System.out.println("查找元素索引值为:"+ret);

    }
    public static int search(int[] nums,int target){
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                index = i;
                return index;
            }
        }
        return index;

    }
}
