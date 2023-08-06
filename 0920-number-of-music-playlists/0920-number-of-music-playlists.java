class Solution {
    int mod = 1000000007;
    int[] result;
    long[][] comb;
    
    public int numMusicPlaylists(int n, int l, int k) {
        result = new int[n-k];
        comb = new long[n+1][(n+1)/2+1];
        for(int i=0; i<n+1; ++i) comb[i][0] = 1;
        for(int i=1; i<n+1; ++i) {
            for(int j=1; j<comb[0].length; ++j) {
                comb[i][j] = comb[i-1][j] + comb[i-1][j-1];
                if(comb[i][j] >= mod) comb[i][j] -= mod;
            }
        }
        for(int i = k+1; i<=n; ++i) result[i-k-1] = f(i, l, k);
        return result[n-k-1];
    }
    
    private int f(int n, int l, int k) {
        int ans = g(n, l, k);
        for(int i = k+1; i<n; ++i) {
            int j = (i <= (n+1)/2) ? i: (n-i);
            long fac = comb[n][j] * result[i-k-1];
            fac = (mod - fac%mod);
            ans += fac;
            if(ans >= mod) ans -= mod;
        }
        return ans;
    }
    
    private int g(int n, int l, int k) {
        long ans = 1;
        for(int i=0; i<k; ++i) {
            ans *= n-i;
            ans %= mod;
        }
        for(int i=k+1; i<=l; ++i) {
            ans *= (n-k);
            ans %= mod;
        }
        return (int) ans;
    }
}