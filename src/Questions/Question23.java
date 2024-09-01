package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question23 {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        nums = separateDigits(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for(int val : nums) {
            if(val >= 10) {
                even++;
            }else {
                odd++;
            }
        }
        int[] res = new int[(2*even)+odd];
        int i = 1;
        int idx = 0;
        int tmp;
        while(i < res.length && idx < nums.length) { // 13,25,83,77
            tmp = nums[idx];
            if(tmp >= 10) {
                res[i] = tmp % 10;
                tmp /= 10;
            }
            if(tmp > 0 && tmp < 10) {
                res[i] = tmp;
                i++;
            }
            idx++;
        }

        return res;
    }
}
