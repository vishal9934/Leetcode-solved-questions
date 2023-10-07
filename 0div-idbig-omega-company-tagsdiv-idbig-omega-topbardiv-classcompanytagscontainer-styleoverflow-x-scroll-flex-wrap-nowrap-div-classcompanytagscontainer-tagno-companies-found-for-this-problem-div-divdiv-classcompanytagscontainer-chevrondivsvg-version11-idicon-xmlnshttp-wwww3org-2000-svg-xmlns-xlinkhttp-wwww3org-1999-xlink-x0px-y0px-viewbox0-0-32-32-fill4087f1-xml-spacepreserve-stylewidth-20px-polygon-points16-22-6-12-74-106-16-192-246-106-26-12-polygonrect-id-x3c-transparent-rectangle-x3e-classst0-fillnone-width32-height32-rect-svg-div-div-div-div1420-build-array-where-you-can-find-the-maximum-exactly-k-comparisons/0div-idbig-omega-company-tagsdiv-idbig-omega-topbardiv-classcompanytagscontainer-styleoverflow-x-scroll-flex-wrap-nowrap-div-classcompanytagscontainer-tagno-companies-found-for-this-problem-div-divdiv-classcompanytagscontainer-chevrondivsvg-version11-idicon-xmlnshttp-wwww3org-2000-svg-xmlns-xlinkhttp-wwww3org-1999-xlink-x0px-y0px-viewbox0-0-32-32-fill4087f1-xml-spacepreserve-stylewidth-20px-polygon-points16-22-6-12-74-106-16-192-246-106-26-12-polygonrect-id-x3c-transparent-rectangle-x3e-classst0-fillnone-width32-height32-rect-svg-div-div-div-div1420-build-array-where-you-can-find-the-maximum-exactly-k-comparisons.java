class Solution {
    public int numOfArrays(int n, int m, int k) {
        memo=new long[n+3][m+3][k+3];
     for (long [][]rows : memo)
         for (long []cols : rows)
             Arrays.fill(cols,-1);
      return (int)solve(n,m,k,0);
    }
    static long [][][]memo;
    static int mod=(int)1e9+7;
    static int N;
    static long solve(int n,int m,int k,int max)
    {
        if (n==0)
            return k==0?1:0;
       if (memo[n][max][k]!=-1)
           return memo[n][max][k];
        long ans=0;
        for (int range=1;range<=m;range++)
        {


            if (range>max) {
                if (k >= 1)
                    ans += solve(n - 1, m, k - 1, range);
            }else
                ans+=solve(n - 1, m, k, max);

            ans%=mod;

        }
        return memo[n][max][k]=ans;
     

    }
    
}