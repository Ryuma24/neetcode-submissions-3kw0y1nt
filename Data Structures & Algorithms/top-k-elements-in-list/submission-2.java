class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }


        //create bucket

        List<List<Integer>>bucket = new ArrayList<>();

        for(int i = 0;i<=nums.length;i++){
            bucket.add(new ArrayList<>());
        }

        for(int key : mp.keySet()){
            int freq = mp.get(key);       
            bucket.get(freq).add(key);
        }

        //collect top k elements

        int res[] = new int[k];
        int idx = 0;
        for(int i = bucket.size()-1; i>=0 && idx<k ;i--){
            if(bucket.get(i)!=null){
                for(int num : bucket.get(i)){
                    res[idx]= num;
                    idx++;
                    if(idx==k)break;
                }
            }
        }

        return res;


    }
}
