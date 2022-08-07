class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        
        int buying = prices[0];
        int selling = prices[1];
        
        int maxProfit = selling-buying;
        
        for(int i =1; i< prices.length-1; i++) {
           
            int today = prices[i];
            
            if(buying > today) buying= today;
            selling = prices[i+1];
            maxProfit = Math.max(maxProfit, selling-buying);
            
            
        }
        return (maxProfit<0? 0: maxProfit);
        
    }
}