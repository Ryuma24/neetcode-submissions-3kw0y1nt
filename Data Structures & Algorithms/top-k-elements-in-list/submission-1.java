class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }


        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            pq.offer(new int[]{entry.getValue(),entry.getKey()});

            if(pq.size()>k){
                pq.poll();
            }
        } 

        int res[] = new int[k];
        for(int i = k-1; i>=0;i--){
            res[i] = pq.peek()[1];
            pq.poll();
        }

        return res;


    }
}
