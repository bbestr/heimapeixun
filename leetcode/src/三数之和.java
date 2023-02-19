import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int i = 0; i < n-2; i++) {

            if (i >0 && nums[i] == nums[i-1]){
                continue;
            }
            int third = n-1;

            for (int j = i+1; j < third; j++) {

                if (j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                while (j < third && nums[j] + nums[third] + nums[i] > 0) {
                    --third;
                }


                if (nums[j] + nums[i] + nums[third] == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[third]);
                    ans.add(temp);
                }
            }


        }



        return ans;


    }
}
