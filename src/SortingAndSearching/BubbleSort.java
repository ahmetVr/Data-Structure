package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     /*   int[] nums = {2,12,3,5,9,6,23,1};
        bubbleSort(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        } */
        int[][] grid = {{1,2,4},{3,3,1}};
        System.out.println(grid2d(grid));

    }

    public static int[] bubbleSort(int[] nums) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            int tmp = 0;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[i-1]) {
                    tmp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = tmp;
                    flag = false;
                }
            }
        }
        return nums;
    }

    public static int grid2d(int[][] grid) {
        for(int[] arr : grid) {
            Arrays.sort(arr);
        }
        int sum = 0;
        for(int col = 0; col < grid[0].length; col++) {
            System.out.println(grid[0][col]);
            int max = 0;

            for(int row = 0; row < grid.length; row++) {
                System.out.println(grid[row][col]);
                if(grid[row][col] > max) {
                    max = grid[row][col];
                }
            }
            sum += max;
        }
        return sum;
    }
}
