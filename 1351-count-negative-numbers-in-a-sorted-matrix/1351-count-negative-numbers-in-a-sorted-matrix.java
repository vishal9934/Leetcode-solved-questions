class Solution {
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int res=0;
        while(row<grid.length && col>=0){
            if(grid[row][col]<0){
                res+=grid.length-row;
                col--;
            }
            else
            row++;
        }
        return res;
    }
}