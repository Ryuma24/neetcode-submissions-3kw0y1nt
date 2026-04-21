class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int area=Math.min(heights[j],heights[i]) * (j-i);
        while(i<j){
               area =  Math.max(Math.min(heights[j],heights[i]) * (j-i), area);
                if(heights[j]<heights[i]){
                    j--;
                }else{
                    i++;
                }
        }

        return area;
    }
}
