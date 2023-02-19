public class 数组元素求和 {
    public static void main(String[] args) {
        int[] nums = {68,27,95,88,171,996,51,210};
        int sum= 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 || nums[i] / 10 % 10 == 7 || nums[i] % 10 == 7){
                continue;
            }
            else{
                sum+=nums[i];
            }
        }
        System.out.println(sum);
    }
}
