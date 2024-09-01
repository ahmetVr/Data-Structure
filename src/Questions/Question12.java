package Questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        targetIndices(nums,2);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int tmp = 0;
            int idx = 0;
            for(int k = i; k < nums.length; k++) {
                if(nums[k] <= min) {
                    min = nums[k];
                    idx = k;
                }
            }
            tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
