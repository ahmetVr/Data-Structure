package Questions;

import java.util.Arrays;

public class Question24 {
    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        System.out.println(countGoodRectangles(rectangles));
    }
    public static int countGoodRectangles(int[][] rectangles) {
        int min = 0;
        int count = 0;
        for(int i = 0; i < rectangles.length; i++) {
            int maxMinVal = Math.min(rectangles[i][0],rectangles[i][1]);
            if(maxMinVal > min) {
                min = maxMinVal;
                count = 0;
            }
            if(min == maxMinVal) {
                count++;
            }
        }
        return count;
    }
}
