public class 数组元素反转 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
//        reverse(nums);
        reverse1(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }

    }

    private static void reverse(int[] nums) {
        int left = 0,right = nums.length-1;

        while(left <right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    private static  void reverse1(int[] nums){

        for (int i = 0,right = nums.length-1; i < right ; i++,right--) {
//            int tem = nums[i];
//            nums[i] = nums[right];
//            nums[right] = tem;


//             异或操作 '^'  个数被另一个数异或两次  结果还是本身. a^b^b = a
//            面试题 :  如何不定义中间变量  交换两个数的值
            nums[i] = nums[i] ^ nums[right];
            nums[right] = nums[i] ^ nums[right];
            nums[i] = nums[i] ^ nums[right];
        }
    }
}
