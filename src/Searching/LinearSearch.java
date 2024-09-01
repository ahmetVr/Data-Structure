package Searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for(int i = 0; i < 1000; i++) {
            arr[i] = (int) ((Math.random() * 1000) + 1);
        }
        Arrays.sort(arr);

        System.out.println(findIndexByBinary(arr,0,99999,77,0));
        System.out.println(findIndex(arr,77));

        for(int i = 0; i < arr.length; i++) {
            System.out.print( i + "-> " + arr[i] + ",");
        }
    }

    public static int findIndex(int[] arr,int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count++;
           if(arr[i] == target) {
               System.out.println( "lınear search count => "+ count);
               return i;
           }
        }
        return -1;
    }

    public static int findIndexByBinary(int[] arr,int l,int h,int target,int count) {
        int m = (l+h) / 2;
        if(l <= h) {
            if(target == arr[m]) {
                System.out.println("Binary search count => " + (count+1));
                return m;
            }else if(target > arr[m]) {
                return findIndexByBinary(arr,m+1,h,target,count+1);
            }else if(target < arr[m]) {
                return findIndexByBinary(arr,l,m-1,target,count+1);
            }
        }
        return -1;
    }

    /*
    Exponential search is also known as doubling or galloping search. This mechanism is used to find the range where the search key may present.

   If L and U are the upper and lower bound of the list, then L and U both are the power of 2. For the last section, the U is the last position of the list. For that reason, it is known as exponential.

   After finding the specific range, it uses the binary search technique to find the exact location of the search key.

   The name of this searching algorithm may be misleading as it works in O(Log n) time. The name comes from the way it searches an element.
     */

    public static int exponentialSearch(int[] arr,int target,int n) {
        if(arr[0] == target) {
            return 0;
        }
        int i = 1;
        while(i < n && target >= arr[i]) {
            i *= 2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,n),target);
    }
}
