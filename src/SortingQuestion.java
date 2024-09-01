public class SortingQuestion {
    public static void main(String[] args) {
        int[] arr = {12,34,5,54,6};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        while(!flag) {
            flag = true;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    flag = false;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j > -1 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
