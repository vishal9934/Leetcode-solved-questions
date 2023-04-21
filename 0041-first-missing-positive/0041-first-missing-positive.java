class Solution {
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int firstMissingPositive(int[] nums) {
        
        // no need to take care of negative and larger number,
        // our answer would lie between 1 to length of nums
        
        for(int i=0;i<nums.length;){
            int current=nums[i];
            if(current>0 && current<nums.length && current!=nums[current-1]){
                swap(nums,i,current-1);
            }
            else{
                i++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)    //like element 5 hai to index 4 hona chaiye 4+1
            return i+1;
        }
        return nums.length+1;
    }
}