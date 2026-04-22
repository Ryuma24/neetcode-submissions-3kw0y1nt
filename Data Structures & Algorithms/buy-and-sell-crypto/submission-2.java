class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int minBuy = prices[0];

        for(int i : prices){
            minBuy = Math.min(minBuy, i);
            int profit = i-minBuy;
            maxi = Math.max(maxi, profit);           
        }

        return maxi;
    }
}
