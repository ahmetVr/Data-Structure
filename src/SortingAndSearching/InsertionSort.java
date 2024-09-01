package SortingAndSearching;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {11,2,6,9,3,12,36,1};
        insertSort(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] insertSort(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}
