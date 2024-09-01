package Questions;

public class Question11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int len = height.length;
        int i = 0, test, j = len-1, max = 0;
        while(i <j) {
            test = height[i] < height[j] ? height[i] : height[j];
            test = (j-i) * test;
            if(max < test) {
                max = test;
            }
            if (height[i] < height[j]) i++;
            else j--;
         }
        return max;
    }
}
