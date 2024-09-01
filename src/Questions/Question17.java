package Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question17 {
    public static void main(String[] args) {
        int[] nums = {3,6,11,9,8,1,2,4};
        nums = sortArrayByParity(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
      int[] ans = new int[nums.length];
      int idx = 0;
      int len = nums.length-1;
      for(int i = 0; i < nums.length; i++) {
          if(nums[i] % 2 == 0) {
              ans[idx] = nums[i];
              idx++;
          }else {
              ans[len] = nums[i];
              len--;
          }
      }
      return ans;
    }
}
