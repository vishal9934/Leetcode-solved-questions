class Solution {
    static int MOD = 1_000_000_000 + 7;
    Integer[][] memo;
    long[][] counts;
    int maxLength = 0;
    public int numWays(String[] w, String target) {
        counts = new long[1000][26];
        // build the counts array
		// it shows how many same characters we have on each position among all words
        for (String q : w) {
            maxLength = Math.max(maxLength, q.length());
            for (int i = 0; i < q.length(); i++) {
                counts[i][q.charAt(i) - 'a']++;
            }
        }
        memo = new Integer[maxLength][target.length()];
        return f(target, 0, 0);
    }
    
    int f(String target, int j, int i) {
	    // we built the word
        if (i == target.length()) return 1;
		// we reached the end of all words, but haven't built the word
        if (j == maxLength) return 0;
        if (memo[j][i] != null) return memo[j][i];
        int f = target.charAt(i) -  'a';
        int res = 0;
        // no need to enter the recursion otherwise
        if (counts[j][f] > 0) {
            // substitute the character in i position from j position in words
			// we can choose it from counts[j][f] words, it would be different solutions, so we multiply
            res = (int) ((counts[j][f] * f(target, j + 1, i + 1)) % MOD);
        }
        // do not substitute character in i position from j position in words
        res += f(target, j + 1, i);
        res %= MOD;
        
        return memo[j][i] = res;
    }
}