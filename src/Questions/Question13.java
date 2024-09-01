package Questions;

import java.util.ArrayList;

public class Question13 {
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        int target = 9;
       nums =  searchRange(nums, target);
       for(int i = 0; i < nums.length; i++) {
           System.out.println(nums[i]);
       }
    }

    public static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        int len = list.size();
        int[] ans = new int[2];
        if (len == 0) {
            ans[0] = -1;
            ans[1] = -1;
        } else if (len == 1) {
            ans[0] = list.get(0);
            ans[1] = list.get(0);
        }else if(len >= 2){
            ans = new int[len];
            for (int i = 0; i < len; i++) { // list = {0,1,2}
                ans[i] = list.get(i);
            }
        }
        return ans;
    }
}