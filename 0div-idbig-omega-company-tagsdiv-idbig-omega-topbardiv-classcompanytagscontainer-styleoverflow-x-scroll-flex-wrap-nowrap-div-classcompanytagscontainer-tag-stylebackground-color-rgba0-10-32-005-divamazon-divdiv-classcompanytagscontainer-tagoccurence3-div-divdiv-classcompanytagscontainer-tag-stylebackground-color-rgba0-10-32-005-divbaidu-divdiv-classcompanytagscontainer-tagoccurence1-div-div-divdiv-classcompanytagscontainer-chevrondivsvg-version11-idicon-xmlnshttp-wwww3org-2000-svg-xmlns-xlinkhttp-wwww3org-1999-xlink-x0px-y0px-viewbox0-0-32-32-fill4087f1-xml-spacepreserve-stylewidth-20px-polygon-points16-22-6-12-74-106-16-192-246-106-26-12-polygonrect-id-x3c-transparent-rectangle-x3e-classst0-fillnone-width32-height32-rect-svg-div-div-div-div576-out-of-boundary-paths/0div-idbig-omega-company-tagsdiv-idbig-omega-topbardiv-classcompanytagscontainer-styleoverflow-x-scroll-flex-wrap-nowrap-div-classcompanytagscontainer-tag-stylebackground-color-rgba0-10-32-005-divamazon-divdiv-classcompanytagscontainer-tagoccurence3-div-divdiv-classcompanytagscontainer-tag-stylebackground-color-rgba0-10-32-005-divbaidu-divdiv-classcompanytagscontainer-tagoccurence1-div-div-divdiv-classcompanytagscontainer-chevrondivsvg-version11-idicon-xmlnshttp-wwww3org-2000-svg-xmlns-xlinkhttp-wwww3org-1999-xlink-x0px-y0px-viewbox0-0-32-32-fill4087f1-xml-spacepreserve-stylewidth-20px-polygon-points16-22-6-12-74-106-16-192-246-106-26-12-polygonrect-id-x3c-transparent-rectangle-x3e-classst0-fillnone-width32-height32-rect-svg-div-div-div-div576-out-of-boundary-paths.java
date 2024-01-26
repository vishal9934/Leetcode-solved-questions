class Solution {
  int mod = 1000000007;
    public int fun(int r, int c, int move, int m , int n, int dp[][][]){
     if(r>=m || c>=n || r<0 || c<0 ){
   return 1;
     }
    if(move<=0)return 0; 
    if(dp[r][c][move]!=-1){
        return dp[r][c][move];
    }
  int d=fun(r-1,c,move-1,m,n,dp);
  int a=fun(r+1,c,move-1,m,n,dp);
  int x=fun(r,c-1,move-1,m,n,dp);
  int b=fun(r,c+1,move-1,m,n,dp);
return dp[r][c][move]=((a+b)%mod + (x+d)%mod)%mod;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
     int dp[][][]=new int[m][n][maxMove+1];
    for(int ele[][]:dp){
        for(int ele1[]:ele){
            Arrays.fill(ele1,-1);
        }
    }
       return fun(startRow,startColumn,maxMove,m,n,dp);
    //    return dp[startRow][startColumn][maxMove]%mod; 
    }
}