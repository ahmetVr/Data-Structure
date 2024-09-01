package Questions;

import javax.imageio.ImageTranscoder;

public class Question14 {
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int indx = 0;
        int[] result = new int[heights.length];
        for(int nums : heights) {
            result[indx] = nums;
            indx++;
        }
        for(int i = 0; i < heights.length; i++) {
            int min = heights[i];
            int tmp = 0;
            int idx = 0;
            for(int k = i; k < heights.length; k++) {
                if(heights[k] <= min) {
                    min = heights[k];
                    idx = k;
                }
            }
            tmp = heights[i];
            heights[i] = heights[idx];
            heights[idx] = tmp;
        }
        int match = 0;
        for(int i = 0; i < result.length; i++) {
            if(result[i] != heights[i]) {
                match++;
            }
        }
        return match;
    }
}
