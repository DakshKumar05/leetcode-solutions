class Solution {
    public int maxProfit(int[] prices) {
        int lowestprice = prices[0];
        int bestprofit = 0;
        
        for(int i=0;i<prices.length;i++){
            if(lowestprice>prices[i]){
                lowestprice=prices[i];
                
            }
            else{
                int currentprofit=prices[i] - lowestprice;
                if (currentprofit>bestprofit){
                    bestprofit=currentprofit;
                }
            }
        }
        return bestprofit;
    }
}
