package Sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {-2,19,6,1,2,13,7,21,5};
        sortArr(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArr(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
