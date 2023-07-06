class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0;
      int currentDayPrice=prices[0];
      
      for(int i=1;i<prices.length;i++){
      
          if(prices[i]<currentDayPrice)
              currentDayPrice=prices[i];
          
           if(prices[i]-currentDayPrice>maxProfit)
               maxProfit=prices[i]-currentDayPrice;
      
      }
      return maxProfit;
}
}