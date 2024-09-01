package Questions;

import java.sql.Array;
import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 4, 4, 3, 4};
        nums = fix34(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    /*
    Return an array that contains exactly the same numbers as the given array,
     but rearranged so that every 3 is immediately followed by a 4.
     Do not move the 3's, but every other number may move.
     The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
     and a 3 appears in the array before any 4.

    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    fix34([1, 3, 1, 4, 4, 3, 4]) → [1, 3, 4, 1, 1, 3, 4]
    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

     */

    public static int[] fix34(int[] nums) {
      int i = 0;
      int j = 0;

      while(i < nums.length && nums[i] != 3) {
          i++;
      }
      j = i+1;
      while(j < nums.length && nums[j] != 4) {
          j++;
      }
      while(i < nums.length) {
          if(nums[i] == 3) {
              int tmp = nums[i+1];
              nums[i+1] = nums[j];
              nums[j] = tmp;
              while(j < nums.length && nums[j] != 4) {
                  j++;
              }
          }
          i++;
      }
      return nums;
    }
}
