class Solution {
    public int combinationSum4(int[] nums, int target) {
        return fn(nums,target,0,new HashMap<Integer,Integer>());
        
    }
   public int fn(int[] nums,int target,int ci,HashMap<Integer,Integer> memo)
    {
        if(ci>=nums.length||target<=0)
           return (target==0)?1:0;
        
        int currentKey = target;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
       int consider = fn(nums,target-nums[ci],0,memo);
        int notConsider = fn(nums,target,ci+1,memo);
        
        memo.put(currentKey,consider+notConsider);
        return consider+notConsider;
    }
}