class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int dir=0;
        int num=1;
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                   matrix[top][i]=num++;
                   
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                   matrix[i][right]=num++;
                   
                }
                 right--;
            }
            else if(dir==2){
                 for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                    
                 }
                  bottom--;
            }
             else if(dir==3){
                 for(int i=bottom;i>=top;i--){
                     matrix[i][left]=num++;
                     
                 }
                 left++;
             }
             dir=(dir+1)%4;
        }
        return matrix;
    }
}