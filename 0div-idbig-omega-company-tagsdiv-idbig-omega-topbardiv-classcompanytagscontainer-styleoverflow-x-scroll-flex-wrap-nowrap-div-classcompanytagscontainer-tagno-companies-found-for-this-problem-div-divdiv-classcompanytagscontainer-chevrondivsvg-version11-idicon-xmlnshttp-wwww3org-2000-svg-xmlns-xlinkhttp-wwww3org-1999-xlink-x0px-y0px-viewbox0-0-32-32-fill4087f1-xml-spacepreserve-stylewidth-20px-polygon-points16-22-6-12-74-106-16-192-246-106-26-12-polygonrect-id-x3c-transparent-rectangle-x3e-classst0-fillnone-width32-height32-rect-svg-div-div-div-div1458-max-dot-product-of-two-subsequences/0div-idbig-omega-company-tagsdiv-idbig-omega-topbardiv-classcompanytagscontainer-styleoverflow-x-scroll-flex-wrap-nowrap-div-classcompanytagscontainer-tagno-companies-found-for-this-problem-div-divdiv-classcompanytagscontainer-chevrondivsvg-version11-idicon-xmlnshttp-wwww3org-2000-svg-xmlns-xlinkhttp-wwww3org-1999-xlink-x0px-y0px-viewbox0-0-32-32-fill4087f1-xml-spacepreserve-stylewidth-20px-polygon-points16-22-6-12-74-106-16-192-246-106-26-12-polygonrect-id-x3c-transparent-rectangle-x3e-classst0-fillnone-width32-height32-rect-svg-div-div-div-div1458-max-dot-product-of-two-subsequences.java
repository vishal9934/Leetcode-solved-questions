class Solution {
    private int[] nums1, nums2;
    private Integer dp[][];

    public int maxDotProduct(int[] nums1, int[] nums2) {
               this.nums1 = nums1;
        this.nums2 = nums2;

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int item: nums1) {
            max1 = Math.max(max1, item);
            min1 = Math.min(min1, item);
        }

        for (int item: nums2) {
            max2 = Math.max(max2, item);
            min2 = Math.min(min2, item);
        }
        
        if (max1 < 0 && min2 > 0) {
            return max1 * min2;
        }

        if (max2 < 0 && min1 > 0) {
            return max2 * min1;
        }

        dp = new Integer[nums1.length][nums2.length];
        return getMaxProd(0, 0); 
    }
     private int getMaxProd(int idx1, int idx2) {
        if (idx1 >= nums1.length || idx2 >= nums2.length) {
            return 0;
        }

        if (dp[idx1][idx2] != null) {
            return dp[idx1][idx2];
        }

        int take = (nums1[idx1] * nums2[idx2]) + getMaxProd(idx1 + 1, idx2 + 1);
        int doNotTakeFirst = getMaxProd(idx1 + 1, idx2);
        int doNotTakeSecond = getMaxProd(idx1, idx2 + 1);

        int ans = Math.max(take, Math.max(doNotTakeFirst, doNotTakeSecond));

        return dp[idx1][idx2] = ans;
    }
}