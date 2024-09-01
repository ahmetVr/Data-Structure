package Questions;

import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        nums = decompressRLElist(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i+=2) {
            for(int k = 0; k < nums[i]; k++) {
                list.add(nums[i+1]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
