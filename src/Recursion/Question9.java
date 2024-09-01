package Recursion;

public class Question9 {
    public static void main(String[] args) {

    }

    /*
    Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index,
    such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.

    groupSum6(0, [5, 6, 2, 4], 12) → true

    groupSum6(0, [5, 6, 2, 6] 13) → false

   groupSum6(0, [5, 6, 2], 7) → false
     */

    public static boolean groupSum(int index,int[] arr, int target) {
        if(index >= arr.length) {
            return target == 0;
        }

        if (arr[index] == 6) {
            return groupSum(index+1,arr,target-6);
        }

        if(groupSum(index+1,arr,target - arr[index])) {
            return true;
        }

        if (groupSum(index+1,arr,target)) {
            return true;
        }

        return false;
    }

    // a + b + c + d + e + f
    // 2 . 2 . 1 . 2. 2. 2

}
