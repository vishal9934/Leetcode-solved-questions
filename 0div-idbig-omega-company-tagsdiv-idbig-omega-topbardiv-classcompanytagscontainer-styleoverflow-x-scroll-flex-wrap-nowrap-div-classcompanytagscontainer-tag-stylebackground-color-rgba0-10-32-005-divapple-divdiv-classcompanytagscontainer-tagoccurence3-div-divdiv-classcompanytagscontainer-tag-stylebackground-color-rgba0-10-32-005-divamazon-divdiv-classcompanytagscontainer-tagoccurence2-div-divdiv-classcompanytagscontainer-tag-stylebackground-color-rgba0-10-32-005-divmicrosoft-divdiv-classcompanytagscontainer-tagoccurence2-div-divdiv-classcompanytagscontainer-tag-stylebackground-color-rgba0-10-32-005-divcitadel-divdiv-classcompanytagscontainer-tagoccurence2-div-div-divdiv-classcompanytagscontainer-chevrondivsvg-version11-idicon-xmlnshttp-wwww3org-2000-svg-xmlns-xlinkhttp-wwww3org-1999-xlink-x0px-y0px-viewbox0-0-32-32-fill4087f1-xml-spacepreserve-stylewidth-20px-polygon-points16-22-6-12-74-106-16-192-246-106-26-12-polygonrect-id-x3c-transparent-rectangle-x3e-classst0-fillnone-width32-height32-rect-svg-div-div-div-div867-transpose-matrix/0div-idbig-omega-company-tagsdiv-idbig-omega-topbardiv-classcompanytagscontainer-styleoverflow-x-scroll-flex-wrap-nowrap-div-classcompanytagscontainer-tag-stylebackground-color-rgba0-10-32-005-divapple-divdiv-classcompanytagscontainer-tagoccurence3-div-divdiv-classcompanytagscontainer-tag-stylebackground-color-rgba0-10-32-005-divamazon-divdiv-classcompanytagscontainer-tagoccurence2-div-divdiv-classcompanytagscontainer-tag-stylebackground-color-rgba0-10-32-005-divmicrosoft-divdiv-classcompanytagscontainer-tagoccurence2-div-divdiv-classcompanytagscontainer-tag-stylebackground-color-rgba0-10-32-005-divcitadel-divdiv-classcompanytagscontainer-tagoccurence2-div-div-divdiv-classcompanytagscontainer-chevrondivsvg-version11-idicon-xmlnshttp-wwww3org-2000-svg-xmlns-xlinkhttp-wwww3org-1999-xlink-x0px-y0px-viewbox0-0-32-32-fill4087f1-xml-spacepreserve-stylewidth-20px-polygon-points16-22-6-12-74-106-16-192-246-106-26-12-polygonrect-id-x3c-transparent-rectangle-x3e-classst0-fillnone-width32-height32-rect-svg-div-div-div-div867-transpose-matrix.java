class Solution {
    public int[][] transpose(int[][] matrix) {

        //storing row length of original matrix
        int m=matrix.length;
        //storing column length of original length
        int n=matrix[0].length;
        //new matrix (temp) of dimensions n x m (original matrix dimension m x n)
        int[][] temp=new int[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[j][i]=matrix[i][j];

            }
        }
        return temp;
    }
}