class Solution {
    public int maxProfit(int[] prices) {
        int small =prices[0];
        int Profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<small){
              small=prices[i];
              
            }
      int  currentProfit=prices[i]-small;
      if(currentProfit>Profit){
        Profit=currentProfit;
      }
        }
        return Profit;
}
}