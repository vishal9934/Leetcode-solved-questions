class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sum=0;
                if(mat[i][j]==1){
                    for(int k=0;k<mat.length;k++){
                        sum+=mat[k][j];
                    }
                    for(int k=0;k<mat[0].length;k++){
                        sum+=mat[i][k];
                    }
                    if(sum==2){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}