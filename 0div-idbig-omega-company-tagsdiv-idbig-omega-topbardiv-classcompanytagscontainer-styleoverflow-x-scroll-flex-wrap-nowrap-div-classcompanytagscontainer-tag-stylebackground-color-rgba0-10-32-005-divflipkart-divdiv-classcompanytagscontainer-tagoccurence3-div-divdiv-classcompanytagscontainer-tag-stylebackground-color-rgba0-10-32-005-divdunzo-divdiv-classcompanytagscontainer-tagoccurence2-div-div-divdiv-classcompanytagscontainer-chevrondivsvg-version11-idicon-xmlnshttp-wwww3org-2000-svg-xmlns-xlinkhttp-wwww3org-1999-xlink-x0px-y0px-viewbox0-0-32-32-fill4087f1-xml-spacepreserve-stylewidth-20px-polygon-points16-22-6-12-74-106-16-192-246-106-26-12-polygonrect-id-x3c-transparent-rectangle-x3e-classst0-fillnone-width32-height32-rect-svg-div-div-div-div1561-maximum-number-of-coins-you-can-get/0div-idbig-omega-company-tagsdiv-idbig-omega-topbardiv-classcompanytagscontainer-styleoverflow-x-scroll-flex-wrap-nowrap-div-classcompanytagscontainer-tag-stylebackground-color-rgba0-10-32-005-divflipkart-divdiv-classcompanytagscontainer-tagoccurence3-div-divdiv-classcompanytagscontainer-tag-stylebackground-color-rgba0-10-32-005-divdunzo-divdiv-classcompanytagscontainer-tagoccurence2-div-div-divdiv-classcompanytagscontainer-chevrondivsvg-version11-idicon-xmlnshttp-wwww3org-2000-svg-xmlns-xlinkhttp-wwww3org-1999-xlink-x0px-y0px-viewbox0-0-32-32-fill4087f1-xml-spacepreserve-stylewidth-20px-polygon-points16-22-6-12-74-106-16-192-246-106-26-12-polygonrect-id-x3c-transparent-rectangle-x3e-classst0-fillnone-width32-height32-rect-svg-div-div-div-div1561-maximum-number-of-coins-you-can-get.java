class Solution {
    public int maxCoins(int[] piles) {
        int maxCoins = 0;
        int[] freq = new int[100001];

        for (int i : piles) {
            freq[i]++;
        }

        int chances = piles.length / 3;
        int turn = 1;
        int i = freq.length - 1;

        while (chances != 0) {
            if (freq[i] > 0) {
                if (turn == 1) {
                    turn = 0;
                } else {
                    maxCoins += i;
                    turn = 1;
                    chances--;
                }

                freq[i]--;
            } else {
                i--;
            }
        }

        return maxCoins;
    }
}