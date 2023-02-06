class Solution {
    public int minPairSum(int[] nums) {
        int maxpairsum=0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length/2;i++){
            maxpairsum=Math.max(maxpairsum,nums[i]+nums[nums.length-1-i]);
        }
        return maxpairsum;
    }
}