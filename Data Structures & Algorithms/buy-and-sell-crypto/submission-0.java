class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] rMax = new int[n];
        int rMaxi = -1;
        for(int i =n-1;i>=0;i--){
            rMaxi = Math.max(prices[i], rMaxi);
            rMax[i] = rMaxi;
        }

        int maxi = -1;
        for(int i=0;i<n;i++){
                maxi = Math.max(rMax[i] - prices[i],maxi);
        }

        return maxi;
    }
}
