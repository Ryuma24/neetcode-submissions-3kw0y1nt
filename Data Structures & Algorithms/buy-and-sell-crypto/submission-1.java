class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int rMaxi = prices[n-1];
        for(int i =n-1;i>=0;i--){
            rMaxi = Math.max(prices[i], rMaxi);
            prices[i] = rMaxi-prices[i];
        }

        int maxi = -1;
        for(int i=0;i<n;i++){
                maxi = Math.max(prices[i],maxi);
        }

        return maxi;
    }
}
