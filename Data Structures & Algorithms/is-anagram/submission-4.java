class Solution {
    public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> freq = new HashMap<>();
            HashMap<Character, Integer> freq2 = new HashMap<>();

            int length = s.length();
            if(s.length() != t.length()) return false;
            for(int i=0;i<length;i++){
                freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
                freq2.put(t.charAt(i),freq2.getOrDefault(t.charAt(i),0)+1);
            }

            return freq.equals(freq2);
            
    }
}
