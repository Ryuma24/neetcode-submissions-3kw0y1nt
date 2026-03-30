class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String,List<String>> mp = new HashMap<>();           
        for(String s : strs){
            int[] cnt = new int[26];
            for(int i=0;i<s.length() ; i++){
                cnt[s.charAt(i)-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int c: cnt){
                key.append('#').append(c);//avoid key based collisions
            }
            String k = key.toString();
            mp.computeIfAbsent(k , x-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());


    }
}
