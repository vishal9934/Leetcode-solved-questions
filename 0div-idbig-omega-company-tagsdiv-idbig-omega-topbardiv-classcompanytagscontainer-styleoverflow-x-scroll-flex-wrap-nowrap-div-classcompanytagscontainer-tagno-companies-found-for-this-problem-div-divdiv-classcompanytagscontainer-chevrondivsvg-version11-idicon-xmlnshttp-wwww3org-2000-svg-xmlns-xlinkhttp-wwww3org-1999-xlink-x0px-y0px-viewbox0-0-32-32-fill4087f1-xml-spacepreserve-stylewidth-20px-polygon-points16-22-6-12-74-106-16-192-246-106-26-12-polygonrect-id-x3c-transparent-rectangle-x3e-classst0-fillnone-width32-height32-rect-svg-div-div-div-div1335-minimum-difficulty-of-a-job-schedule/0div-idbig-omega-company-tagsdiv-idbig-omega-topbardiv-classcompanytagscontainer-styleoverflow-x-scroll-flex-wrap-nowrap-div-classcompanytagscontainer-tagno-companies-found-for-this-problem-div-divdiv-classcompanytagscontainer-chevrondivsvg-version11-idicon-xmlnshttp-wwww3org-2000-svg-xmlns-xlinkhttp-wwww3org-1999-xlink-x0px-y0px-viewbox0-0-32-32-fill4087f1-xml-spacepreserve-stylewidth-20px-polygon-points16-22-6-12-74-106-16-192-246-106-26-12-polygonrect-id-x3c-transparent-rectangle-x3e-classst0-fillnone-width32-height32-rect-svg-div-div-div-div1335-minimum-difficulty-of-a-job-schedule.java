class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[][] dp = new int[d + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= n; j++) {
                int maxDifficulty = 0;
                for (int k = j - 1; k >= i - 1; k--) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + maxDifficulty);
                }
            }
        }

        return dp[d][n];
    }
}
