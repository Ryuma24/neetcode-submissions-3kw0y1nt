class Solution {
    public int singleNumber(int[] nums) {

        int len = nums.length;
       int res= nums[0];
        for(int i = 1 ;i<len;i++){
            res^=nums[i];
        }

        return res;
    }
}
