import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        //  plusOne(digits);
        //   String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //     groupAnagrams(strs);
     /*   String[] strs = {"eat","tea","tan","ate","nat","bat"};

        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        int[] nums1 = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums1,7));
        */
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat","elma","amel","lema","mela","kata","malt","tana"};
        ArrayList<String> strInput = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            strInput.add(strs[i]);
        }

        System.out.println( groupAnagrams(strInput));

    }

    /*
    strs = ["eat","tea","tan","ate","nat","bat"]
    OUTPUT
    [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static ArrayList<ArrayList<String>> groupAnagrams(ArrayList<String> strs) { // List<List<String>>
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> inputList = new ArrayList<String>(strs);
        String ans = "";
        int idx = 0;
        while(inputList.size() > 0) {
            list.add(new ArrayList<String>());
            ans = inputList.get(0);
            list.get(idx).add(ans);
            for(int i = 1; i < inputList.size(); i++) {
               if(isAnagram(ans,inputList.get(i))) {
                  list.get(idx).add(inputList.get(i));
                  inputList.remove(inputList.get(i));
                  i--;
               }
            }
            inputList.remove(ans);
            idx++;
        }
        return list;
    }
    public static boolean isAnagram(String str1,String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];

        for(int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++) {
           if(arr1[i] != arr2[i]) {
               return false;
           }
        }
        return true;
    }


    /*
    Input: nums = [1,3,5,6], target = 5
    Output: 2

    nums = [1,3,5,6], target = 2
    Output: 1

    nums = [1,3,5,6], target = 7
    Output: 4
     */

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
   for(int i = 0; i < nums.length; i++) {
       if(nums[i] == target) {
           result = i;
       }else if(nums[i] < target &&  nums[nums.length-1] > target) {
           result = i+1;
       }else if(nums[i] < target && nums[nums.length-1] < target) {
           result = nums.length;
       }

   }
        return result;
    }

    /*
    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
     */

    public static int lengthOfLastWord(String s) {
     char c = ' ';
     int count = 0;
     boolean flag = false;
     for(int i = s.length()-1; i >= 0; i--) {
         if(s.charAt(i) != c && flag != true) {
             flag = true;
         }
         if(flag && s.charAt(i) != c) {
             count++;
         }
         else if(flag && s.charAt(i) == c) {
             break;
         }
     }
     return count;
    }

    /*
    Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
     */

    public static void plusOne(int[] digits) { // int[]
        int[] result = new int[digits.length];
        int idx = 0;
        int num = 0;
        for(int i = digits.length-1; i >= 0; i--) {
            num += (int) (digits[idx]* Math.pow(10,i));
            idx++;
        }

        num = num +1;
        int indx = 0;
        for(int i = 0; i < digits.length;  i++) { // 5-3-2-1
          result[i] = num % 10;
          num /= 10;
        }
       for(int k = result.length-1; k >= 0; k++) {
           while(indx < result.length) {
               result[k] = digits[indx];
               indx++;
           }

       }
       for(int m = 0; m < result.length; m++) {
           System.out.println(result[m]);
       }
    }
}
