// We can add all the elements of the arr and add to reverse signed array Max Sum Subarray
// eg. arr_sum = 10
// reverse sign arr[ ] = {-5, 2, -3, -4}
// Max Sum Subarray = 2
// therefore 10 + 2 = 12


class Solution {
    int kadens(int[] nums){
        int n=nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i%n];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
            
        }
        return maxi;
    }
    public int maxSubarraySumCircular(int[] nums) {
       int normalMaxSum=kadens(nums);
       
        if(normalMaxSum < 0)
            return normalMaxSum;
            
       int sum=0;
       for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           nums[i]=-nums[i];  //changing positive to negatve
       }
       int circularMaxSum=sum+kadens(nums);
       return Math.max(normalMaxSum,circularMaxSum);
    }
}