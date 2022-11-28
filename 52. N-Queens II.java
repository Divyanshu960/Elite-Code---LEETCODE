class Solution {
    public int totalNQueens(int n) {
        if(n == 0) return 0;
        return backtrace(0, n, new boolean[n][n], new boolean[n]);
    }
    private static int backtrace(int level ,int n, boolean[][] chess, boolean[] used){
        if(level == n) return 1;
        else{
            int count = 0;
            for(int i = 0; i < n; i++){
                if(used[i]) continue;
                if(isValid(chess, level, i, n)){
                    used[i] = true;
                    chess[level][i] = true;
                    count += backtrace(level + 1, n, chess, used);
                    used[i] = false;
                    chess[level][i] = false;
                }
            }
            return count;
        }
    }
    private static boolean isValid(boolean[][] chess, int row, int col, int n){
        if(row > 0){
            for(int i = 0; i < row; i++)
                if(chess[i][col]) return false;
            int tempRow = row;
            int tempCol = col;
            while(--tempRow >= 0 && --tempCol >= 0)
                if(chess[tempRow][tempCol]) return false;
            tempRow = row;
            tempCol = col;
            while(--tempRow >= 0 && ++tempCol <= n - 1)
                if(chess[tempRow][tempCol]) return false;
        }
        return true;
    }
}
