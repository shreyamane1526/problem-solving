class Solution {
    public int maxProfit(int[] prices) {
        int buyStock=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-buyStock>profit){
                profit=prices[i]-buyStock;
            }
            if(prices[i]<buyStock){
                buyStock=prices[i];
            }
        }
        return profit;
    }
}