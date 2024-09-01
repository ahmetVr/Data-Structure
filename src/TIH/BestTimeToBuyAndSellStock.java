package TIH.FirstDay;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int first = 0;
        int move = 0;
        if(prices.length > 1) {
            move = 1;
        }else {
            return 0;
        }
        int diff = 0;
        int maxDiff = 0;

        while(move <= prices.length-1) {
            if(prices[first] > prices[move]) {
                first = move;
                move++;
            }
            else if(prices[first] < prices[move]) {
                diff = prices[move] - prices[first];
                if(diff > maxDiff) {
                    maxDiff = diff;
                }
                move++;
             }
        }
        return maxDiff;
    }
}
