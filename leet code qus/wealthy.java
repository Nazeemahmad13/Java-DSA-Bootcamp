public class wealthy {
    public static void main(String[] args) {
        int [][] accounts = {{5,1},{7,3},{3,5}};
        System.out.println( "Wealth: "+ maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {
          int max= Integer.MIN_VALUE  ;
        for (int person = 0; person < accounts.length ; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum +=  accounts[person][account] ;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
