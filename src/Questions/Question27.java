package Questions;

public class Question27 {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        arr = replaceElements(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] replaceElements(int[] arr) {
        int tmp = 0;
        int max = 0;
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length-1; i++) {
            tmp = arr[i];
            for(int k = i+1; k < arr.length; k++) {
                max = arr[k];
               if(arr[k] > max) {
                   max = arr[k];
               }
            }
            tmp = max;
            ans[i] = tmp;
        }
        arr = ans;
        return arr;
    }
}
