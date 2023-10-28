//121. Best Time to Buy and Sell Stock

public class buy_sell {
    public static void main(String[] args) {
    int [] prices={7,1,5,3,6,4};
    int profitOP= maxProfit(prices);
        System.out.println(profitOP);

//        System.out.println( prices.length);
    }


    public static int maxProfit(int[] prices) {
        int max=0; int profit=0;
        for(int i=0; i< prices.length;i++){
            for(int j=i+1; j<prices.length;j++){
                if(prices[i] < prices[j]){
                    max= prices[j]-prices[i];
                    if( max > profit) profit=max;
                }
            }


        }
        return profit;

    }
}
