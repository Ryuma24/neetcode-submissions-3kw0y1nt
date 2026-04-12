class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> check = new HashSet<>();
      
        for(int i=0;i<9;i++){
            for(int j = 0; j < 9 ;j ++){
                char num = board[i][j];
                if(num == '.') continue;

                String row = num + "row" + i;
                String col = num + "col" + j;
                String grid = num + "grid" + i/3 + "-" + j/3;

                if(!check.add(row) || !check.add(col) || !check.add(grid)){
                    return false;
                }
            }
        }


        return true;
    }
}
