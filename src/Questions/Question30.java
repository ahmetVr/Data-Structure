package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res2 = intersect(nums1,nums2);
        for(int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]) {
                i++;
            }else {
                j++;
            }
        }
        int[] ans = new int[result.size()];
        for(int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }
        return ans;
    }
}
