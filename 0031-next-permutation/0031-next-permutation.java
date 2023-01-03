class Solution {
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums.length==1 || nums==null) return;

       int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1]){
           i--;
       }

       if(i>=0){
           int j=nums.length-1;
           while(j>=0 && nums[j]<=nums[i]){
               j--;
           }
           swap(nums,i,j);
       }
        reverse(nums,i+1,nums.length-1);
    }
}