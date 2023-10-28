//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

import java.util.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] prices ={ 7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int minVal=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length; i++){
            minVal=Math.min(prices[i], minVal);
            int profit= prices[i]- minVal;
            maxprofit=Math.max(maxprofit,profit);

        }
        return maxprofit;
    }
}
