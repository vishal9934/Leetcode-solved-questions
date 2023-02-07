class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int max=1;
        
        for(int i=0;i<nums.length-max;i++){
            int curlen=1;
            
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] & nums[j])==0){
                    nums[i] |=nums[j];
                    curlen++;
                }
                else{
                    break;
                }
            }
            max=Math.max(max,curlen);
        }
        return max;
    }
}