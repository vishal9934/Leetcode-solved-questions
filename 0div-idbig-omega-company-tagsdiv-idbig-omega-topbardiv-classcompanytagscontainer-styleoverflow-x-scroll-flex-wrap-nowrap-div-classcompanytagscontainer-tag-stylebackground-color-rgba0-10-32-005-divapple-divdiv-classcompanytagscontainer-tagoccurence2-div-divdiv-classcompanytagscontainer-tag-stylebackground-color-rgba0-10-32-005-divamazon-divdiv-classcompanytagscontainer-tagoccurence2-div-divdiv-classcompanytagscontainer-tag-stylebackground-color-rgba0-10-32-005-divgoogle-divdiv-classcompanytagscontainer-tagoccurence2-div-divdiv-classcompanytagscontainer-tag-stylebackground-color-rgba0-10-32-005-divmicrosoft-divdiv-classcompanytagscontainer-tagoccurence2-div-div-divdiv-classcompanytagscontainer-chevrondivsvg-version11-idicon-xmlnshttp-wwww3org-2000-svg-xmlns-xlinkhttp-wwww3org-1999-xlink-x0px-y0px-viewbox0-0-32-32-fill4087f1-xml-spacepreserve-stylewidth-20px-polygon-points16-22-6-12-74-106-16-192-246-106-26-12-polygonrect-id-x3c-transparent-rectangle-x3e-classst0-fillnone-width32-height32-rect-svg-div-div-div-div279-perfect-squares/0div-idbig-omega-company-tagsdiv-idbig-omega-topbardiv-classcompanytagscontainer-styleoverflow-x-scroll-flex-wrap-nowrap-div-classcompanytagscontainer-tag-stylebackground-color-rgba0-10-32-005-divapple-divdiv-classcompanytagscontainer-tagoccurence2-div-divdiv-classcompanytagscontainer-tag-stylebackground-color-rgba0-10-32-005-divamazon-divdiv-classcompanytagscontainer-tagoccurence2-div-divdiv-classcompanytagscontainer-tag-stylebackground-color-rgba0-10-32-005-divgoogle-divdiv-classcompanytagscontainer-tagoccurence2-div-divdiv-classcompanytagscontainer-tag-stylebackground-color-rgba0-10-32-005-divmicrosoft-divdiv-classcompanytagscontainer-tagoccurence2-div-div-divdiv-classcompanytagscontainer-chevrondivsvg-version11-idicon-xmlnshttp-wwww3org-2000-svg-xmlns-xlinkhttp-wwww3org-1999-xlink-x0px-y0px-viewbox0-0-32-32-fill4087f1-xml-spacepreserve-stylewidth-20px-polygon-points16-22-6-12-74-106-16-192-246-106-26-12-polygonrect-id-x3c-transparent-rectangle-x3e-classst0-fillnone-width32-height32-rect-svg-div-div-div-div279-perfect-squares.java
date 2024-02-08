class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public int helper(int n,int[] dp){
        if(n == 0)
        return 0;
        if(n < 0)
        return Integer.MAX_VALUE;
        if(dp[n] != -1)
        return dp[n];
        int ans = Integer.MAX_VALUE;
        for(int i=1;i*i <= n;i++){
            ans = Math.min(ans,1+helper(n-i*i,dp));
        }
        return dp[n] = ans;
    }
}