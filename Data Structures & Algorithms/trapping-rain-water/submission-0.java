class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int[] rmax = new int[n];
       int[] lmax = new int[n];
       int maxi= -1;
       for(int i = 0;i<n;i++){
            maxi = Math.max(maxi, height[i]);
            lmax[i] = maxi;
       }
        maxi = -1;
       for(int i = n-1 ;i>=0;i--){
            maxi = Math.max(maxi, height[i]);
            rmax[i] = maxi;
       }
        int ans = 0;
       for(int i = 0;i<n;i++){
            ans += Math.min(rmax[i],lmax[i]) - height[i];
       }

       return ans;
    }
}
