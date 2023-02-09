class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int minDiff=Integer.MAX_VALUE;
        
        
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                
                if(Math.abs(target-minDiff) > Math.abs(target-sum)){
                    minDiff=sum;    
                }
                if(sum<target) low++;
                else{
                    high--;
                }
            }
        }
        return minDiff;
    }
}