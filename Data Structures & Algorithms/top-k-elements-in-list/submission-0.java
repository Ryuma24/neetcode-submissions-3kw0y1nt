class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list = new ArrayList<>(mp.keySet());

        list.sort((a,b)-> mp.get(b)-mp.get(a));//sorted on reverse order of frequency 

        int res[] = new int[k];
        for(int i = 0; i<k;i++){
            res[i] = list.get(i);
        }

        return res;


    }
}
