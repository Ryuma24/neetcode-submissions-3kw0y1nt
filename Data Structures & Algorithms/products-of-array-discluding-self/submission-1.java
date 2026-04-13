class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int product2 = 1;
        int flag = nums.length;
        int[] pre = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pre[i] = product;
            product *= nums[i];
        }
        int[] post = new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
          post[i] = product2;
          product2*= nums[i];
        }

        for(int i = 0; i<nums.length;i++){
            pre[i] *= post[i];
        }

        return pre;
    }
}  
