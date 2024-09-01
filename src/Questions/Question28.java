package Questions;

public class Question28 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = prices.length-1; i > 0; i--) {
            for(int k = 0; k < prices.length-1; k++) {
                if(k < i) {
                    if(prices[i] - prices[k] > max) {
                        max = prices[i] - prices[k];
                    }
                }
            }
        }
        if(max < 0) {
            return 0;
        }
        return max;
    }
}
