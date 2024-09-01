package Questions;

public class Question1 {
    public static void main(String[] args) {
        //int[] arr = {3,2,4,5,8};
        //copyEvens(arr,2);
        //for(int i = 0; i < arr.length; i++) {
          //  System.out.println(arr[i]);
        //}

        String[] arr2 = {"a", "b", "c", "a"};
        arr2 = wordsWithout(arr2,"a");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
    /*
    Given an array of positive ints,
    return a new array of length "count" containing the first even numbers from the original array.
     The original array will contain at least "count" even numbers.

     copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
     copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
     copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     */



    public static int[] copyEvens(int[] nums, int count) {
        int[] ans = new int[count];
        int idx = 0;
        for(int i = 0; idx < count; i++) {
            if (nums[i] % 2 == 0 ) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        return ans;
    }

    /*
    wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
     */

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals(target)){
              count++;
            }
        }

        String[] ans = new String[count];
        int idx = 0;
        for(int i = 0; idx < count; i++) {
            if(!words[i].equals(target)) {
               ans[idx] = words[i];
               idx++;
            }
        }

        return ans;
    }
}
