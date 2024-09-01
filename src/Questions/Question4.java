package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        String[] a = {"a", "c", "z"};
        String[] b = {"c","f","z"};
        String[] ans = new String[3];
        ans = mergeTwo(a,b,3);
         for(int i = 0; i < ans.length; i++) {
             System.out.println(ans[i]);
         }

    }
    /*
    Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
    Return a new array containing the first N elements from the two arrays.
    The result array should be in alphabetical order and without duplicates.
    A and B will both have a length which is N or more.
    The best "linear" solution makes a single pass over A and B,
    taking advantage of the fact that they are in alphabetical order,
    copying elements directly to the new array.

   mergeTwo(["a", "b", "z"], ["c", "f", "z"], 3) → ["a", "b", "c"]
   mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
   mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
     */
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int aIdx = 0;
        int bIdx = 0;
        for(int i = 0; i < n; i++) {
            if(a[aIdx].compareTo(b[bIdx]) < 0) {
                arr[i] = a[aIdx];
                aIdx++;
            }else if(b[bIdx].compareTo(a[aIdx]) < 0) {
                arr[i] = b[bIdx];
                bIdx++;
            }else {
                arr[i] = a[aIdx];
                aIdx++;
                bIdx++;
            }
        }
        return arr;
    }
}
