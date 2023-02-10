public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4,5};
        int flag = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1] > nums[i]){
                flag ++;

            }
            else{
                flag--;
            }

        }
        if (Math.abs(flag) == nums.length-1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
