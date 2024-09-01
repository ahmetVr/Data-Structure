package SortingAndSearching;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {

    /*    int[] arr = {3,9,6,1,2};
        sortingAlg(arr);
       // insertAlgorithm(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int[] arr = {1,2,3,5,7};
        int n = 5;
        int s = 12;
        subarraySum(arr,n,s);  */
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(numbers));
    }


    public static int[] sortingAlg(int[] arr) {


        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int idx = 0;
            int tmp = 0;
            for(int k = i; k < arr.length; k++) {
                if(arr[k] <= min) {
                    min = arr[k];
                    idx = k;
                }
            }
            tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int tmp = 0;
        int tmp2 = 0;
        for(int i = 0; i < arr.length-1; i++) {
            tmp = arr[i];
            for(int k = i+1; k < arr.length; k++) {
                tmp2 += arr[k];
                if(tmp + tmp2 == s) {
                    list.add(i);
                    list.add(k);
                }
            }
        }
        return list;
    }



    public static String createPhoneNumber(int[] numbers) { // numbers [1,2,3,4,5,6,7,8,9,0]
        // Your code here!
        String ans = "(";
        for(int i = 0; i < numbers.length; i++) {
            ans += String.valueOf(numbers[i]);
            if(i == 2) {
                ans +=  ") ";
            }else if(i == 5) {
                ans += "-";
            }
        }
        return ans;
    }

    }

