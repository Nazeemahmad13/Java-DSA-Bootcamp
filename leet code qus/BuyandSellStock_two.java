//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class BuyandSellStock_two {

        public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            System.out.println(maxProfit(prices));

        }

      /*  public int maxProfit(int[] prices) {
          int Total_profit = 0;
            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    Total_profit+=( prices[i]-prices[i-1]);
                }
            }
            return Total_profit;

    }*/


        public static int maxProfit(int[] prices) {
            int Total_profit = 0;
            int minVal = prices[0];
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                minVal = Math.min(prices[i], minVal);

                int profit = prices[i] - minVal;

                maxprofit = Math.max(maxprofit, profit);
                if (profit < maxprofit) {
                    minVal = prices[i];
                    Total_profit += maxprofit;
                    maxprofit = 0;
                }
            }
            Total_profit += maxprofit;
            return Total_profit;
        }

}
