class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>s =new HashSet<>();
        int n = nums.length;
        if(n==0)return 0;
        for(int i= 0;i< n;i++){
            s.add(nums[i]);
        }
        int count=1;
        int countMax = 1;
        for(int i=0;i<n;i++){
            if(!s.contains(nums[i]-1)){
                int idx =nums[i]+1;
                for (int j =0;j<s.size();j++){
                    if(s.contains(idx)){
                       count++;
                       idx++;
                    }
                }
            }

            countMax= Math.max(count,countMax);
            count= 1;
        }
    

    return countMax;
    }
}
