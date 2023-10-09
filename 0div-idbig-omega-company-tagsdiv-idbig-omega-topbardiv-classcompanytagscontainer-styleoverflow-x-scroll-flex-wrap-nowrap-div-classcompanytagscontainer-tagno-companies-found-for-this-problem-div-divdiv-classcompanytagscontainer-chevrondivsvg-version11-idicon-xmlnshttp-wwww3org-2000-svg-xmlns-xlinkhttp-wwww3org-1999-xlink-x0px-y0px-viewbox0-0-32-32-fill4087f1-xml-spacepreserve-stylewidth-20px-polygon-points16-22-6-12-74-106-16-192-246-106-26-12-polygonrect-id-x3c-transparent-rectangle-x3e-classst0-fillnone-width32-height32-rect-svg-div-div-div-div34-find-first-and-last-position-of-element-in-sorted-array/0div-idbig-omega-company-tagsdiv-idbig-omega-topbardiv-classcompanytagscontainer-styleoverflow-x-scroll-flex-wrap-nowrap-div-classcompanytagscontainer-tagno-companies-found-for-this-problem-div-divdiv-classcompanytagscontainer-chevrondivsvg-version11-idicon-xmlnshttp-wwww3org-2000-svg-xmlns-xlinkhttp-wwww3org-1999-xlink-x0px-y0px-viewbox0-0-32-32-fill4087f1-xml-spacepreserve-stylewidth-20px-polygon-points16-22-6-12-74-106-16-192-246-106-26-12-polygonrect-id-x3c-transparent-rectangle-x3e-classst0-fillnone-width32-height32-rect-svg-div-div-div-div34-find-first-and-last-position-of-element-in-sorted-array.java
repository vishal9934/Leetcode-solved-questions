class Solution {
    public int[] searchRange(int[] nums, int target) {
            int firstIndex=-1;
            int lastIndex=-1;
            int[] arr=new int[nums.length];
            
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==target){
                            firstIndex=i;
                            break;
                    }
            }
            for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]==target){
                            lastIndex=i;
                            break;
                    }
            }
            return arr=new int[] {firstIndex,lastIndex};
    } 
}