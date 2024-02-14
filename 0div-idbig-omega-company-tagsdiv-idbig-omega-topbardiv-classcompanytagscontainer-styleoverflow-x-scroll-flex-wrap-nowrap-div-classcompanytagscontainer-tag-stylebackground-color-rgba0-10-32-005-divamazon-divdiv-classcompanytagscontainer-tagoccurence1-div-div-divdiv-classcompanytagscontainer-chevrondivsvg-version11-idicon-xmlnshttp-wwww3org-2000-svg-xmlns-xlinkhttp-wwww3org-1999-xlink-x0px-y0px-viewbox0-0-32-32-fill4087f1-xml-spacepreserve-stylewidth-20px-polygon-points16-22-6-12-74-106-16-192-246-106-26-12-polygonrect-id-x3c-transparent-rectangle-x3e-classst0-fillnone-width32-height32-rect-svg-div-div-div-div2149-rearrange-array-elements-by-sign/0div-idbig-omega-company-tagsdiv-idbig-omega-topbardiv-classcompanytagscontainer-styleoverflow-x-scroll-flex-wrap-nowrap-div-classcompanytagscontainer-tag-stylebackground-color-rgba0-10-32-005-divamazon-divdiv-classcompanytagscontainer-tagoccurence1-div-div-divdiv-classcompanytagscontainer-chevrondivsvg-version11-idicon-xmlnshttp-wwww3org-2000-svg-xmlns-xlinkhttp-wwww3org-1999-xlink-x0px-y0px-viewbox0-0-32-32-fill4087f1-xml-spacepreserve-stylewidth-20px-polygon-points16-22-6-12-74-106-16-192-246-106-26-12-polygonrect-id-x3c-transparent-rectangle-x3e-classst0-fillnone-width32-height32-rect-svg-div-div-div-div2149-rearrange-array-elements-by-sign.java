class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        int a1=0;
        int b1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[a1]=nums[i];
                a1++;
            }else{
                b[b1]=nums[i];
                b1++;
            }
        }
        int a2=0;
        int b2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=a[a2];
                a2++;
            }else{
                nums[i]=b[b2];
                b2++;
            }
        }
        return nums;
    }
}