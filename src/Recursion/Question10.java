package Recursion;

public class Question10 {
    /*
    Given an array of ints, is it possible to divide the ints into two groups,
     so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other.
      Write a recursive helper method that takes whatever arguments you like,
       and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

       splitOdd10([5, 5, 5]) → true

       splitOdd10([5, 5, 6]) → false

       splitOdd10([5, 5, 6, 1]) → true
     */

    public static boolean splitOdd10(int[] arr) {
   return false;
    }

    // 5 5 6 1
    public static boolean helper(int idx,int[] arr, int mult, int odd) {
        if (idx >= arr.length) {
            return mult % 10 == 0 && odd % 2 == 1;
        }

        if (helper((idx + 1), arr, mult + arr[idx], odd ) ) {
            return true;
        }

        if (helper((idx+1), arr, mult, odd + arr[idx])) {
            return true;
        }

        return false;
    }
}
