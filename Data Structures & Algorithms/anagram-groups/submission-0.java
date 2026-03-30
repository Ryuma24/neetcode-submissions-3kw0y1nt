class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String,List<String>> mp = new HashMap<>();           
        for(int i=0;i<len;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            mp.computeIfAbsent(sorted, k->new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(mp.values());


    }
}
