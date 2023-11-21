import java.util.Arrays;

class Solution {
    static final int MOD = (int) 1e9 + 7;

    public int countNicePairs(int[] nums) {
        //a + rev(b) == rev(a) + b <=> a-rev(a) == b-rev(b)
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }
        Arrays.sort(nums);
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[start]) {
                ans = (int) ((((((long) (i - start) * (i - start - 1)) / 2) % MOD) + ans) % MOD);
                start = i;
            }
        }
        ans = (int) ((((((long) (n - start) * (n - start - 1)) / 2) % MOD) + ans) % MOD);
        return ans;
    }

    private int rev(int a) {
        int ans = 0;
        while (a > 0) {
            ans = ans * 10 + a % 10;
            a /= 10;
        }
        return ans;
    }
}