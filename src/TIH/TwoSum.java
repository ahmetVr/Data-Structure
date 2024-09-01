package TIH.FirstDay;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = new int[2];
        res = twoSum(nums,target);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] nums,int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                ans[1] = i;
                ans[0] = map.get(target-nums[i]);
            }else {
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
