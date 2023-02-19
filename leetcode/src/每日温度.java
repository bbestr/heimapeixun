import java.util.Deque;
import java.util.LinkedList;
//  单调栈解法
public class 每日温度 {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> temper = new LinkedList<Integer>();
        int n = temperatures.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int tem = temperatures[i];

            while(!temper.isEmpty() && tem > temperatures[temper.peek()]){
                int preindex = temper.pop();
                ans[preindex] = i - preindex;
            }
            temper.push(i);
        }
        return ans;
    }
}
