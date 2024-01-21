class Solution {
    private Integer dp[];
    int helper(int[] nums,int index){
        if(index>=nums.length) return 0;
        
        if(dp[index]!=null)
            return dp[index];
        
        int current=nums[index]+helper(nums,index+2);
        int skipCurrent=helper(nums,index+1);
        
        return dp[index]=Math.max(current,skipCurrent);
        
    }
    public int rob(int[] nums) {
        dp=new Integer[nums.length];
      return helper(nums,0);
        
    }
}