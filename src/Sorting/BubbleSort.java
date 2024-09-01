package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,9,1,13,22};
        sortBubble(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        /*
          3-6-9-1-13-22
          3-6-9-1-13-22
          3-6-9-1-13-22
          3-6-1-9-13-22
          3-6-1-9-13-22

          3-6-1-9-13-22
          3-1-6-9-13-22
          3-1-6-9-13-22
          3-1-6-9-13-22
          3-1-6-9-13-22

          1-3-6-9-13-22

          1-3-6-9-13-22
         */
        int[] arr2 = {4,2,1,5,3};
        /*
        2-4-1-5-3
        2-1-4-5-3
        2-1-4-5-3
        2-1-4-3-5

        1-2-4-3-5
        1-2-4-3-5
        1-2-3-4-5
        1-2-3-4-5

        1-2-3-4-5
         */
    }

    public static void sortBubble(int[] arr) {
        boolean flag = false;
        while(!flag) {
            flag = true;
            for(int i = 1; i < arr.length; i++) { // 4,2,1,5,3
                int tmp = 0;
                if(arr[i] < arr[i-1]) { // 4-2
                    tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    flag = false;
                }
            }
        }
    }
}
