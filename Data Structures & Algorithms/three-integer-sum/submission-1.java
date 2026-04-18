class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            int target = 0-nums[i];
            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    List<Integer>ans2 = new ArrayList<>();
                    ans2.add(nums[i]);
                    ans2.add(nums[j]);
                    ans2.add(nums[k]);
                    ans.add(ans2);
                    j++;
                    k--;
                      // skip duplicate j
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
