class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        Map<Character,Character> mp= new HashMap<>();

        mp.put('}','{');
        mp.put(')','(');
        mp.put(']','[');

       if(len%2!=0)return false;

        for(char x : s.toCharArray()){
            
            if(mp.containsKey(x)){
                if(!st.empty() && st.peek()==mp.get(x)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(x);
            }
        }
      

        
        return st.isEmpty();
    }
}
