class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[index]=nums[left]*nums[left];
                left++;
            }
            else{
                ans[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return ans;
    }
}