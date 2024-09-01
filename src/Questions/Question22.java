package Questions;

import java.util.ArrayList;

public class Question22 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int k = arr.length-1; k >= 0; k--) {
                if((i+k) % 2 == 0) {
                    for(int j = i; j <= k; j++) {
                        sum += arr[j];
                    }
                }
            }
        }
        return sum;
    }

}
