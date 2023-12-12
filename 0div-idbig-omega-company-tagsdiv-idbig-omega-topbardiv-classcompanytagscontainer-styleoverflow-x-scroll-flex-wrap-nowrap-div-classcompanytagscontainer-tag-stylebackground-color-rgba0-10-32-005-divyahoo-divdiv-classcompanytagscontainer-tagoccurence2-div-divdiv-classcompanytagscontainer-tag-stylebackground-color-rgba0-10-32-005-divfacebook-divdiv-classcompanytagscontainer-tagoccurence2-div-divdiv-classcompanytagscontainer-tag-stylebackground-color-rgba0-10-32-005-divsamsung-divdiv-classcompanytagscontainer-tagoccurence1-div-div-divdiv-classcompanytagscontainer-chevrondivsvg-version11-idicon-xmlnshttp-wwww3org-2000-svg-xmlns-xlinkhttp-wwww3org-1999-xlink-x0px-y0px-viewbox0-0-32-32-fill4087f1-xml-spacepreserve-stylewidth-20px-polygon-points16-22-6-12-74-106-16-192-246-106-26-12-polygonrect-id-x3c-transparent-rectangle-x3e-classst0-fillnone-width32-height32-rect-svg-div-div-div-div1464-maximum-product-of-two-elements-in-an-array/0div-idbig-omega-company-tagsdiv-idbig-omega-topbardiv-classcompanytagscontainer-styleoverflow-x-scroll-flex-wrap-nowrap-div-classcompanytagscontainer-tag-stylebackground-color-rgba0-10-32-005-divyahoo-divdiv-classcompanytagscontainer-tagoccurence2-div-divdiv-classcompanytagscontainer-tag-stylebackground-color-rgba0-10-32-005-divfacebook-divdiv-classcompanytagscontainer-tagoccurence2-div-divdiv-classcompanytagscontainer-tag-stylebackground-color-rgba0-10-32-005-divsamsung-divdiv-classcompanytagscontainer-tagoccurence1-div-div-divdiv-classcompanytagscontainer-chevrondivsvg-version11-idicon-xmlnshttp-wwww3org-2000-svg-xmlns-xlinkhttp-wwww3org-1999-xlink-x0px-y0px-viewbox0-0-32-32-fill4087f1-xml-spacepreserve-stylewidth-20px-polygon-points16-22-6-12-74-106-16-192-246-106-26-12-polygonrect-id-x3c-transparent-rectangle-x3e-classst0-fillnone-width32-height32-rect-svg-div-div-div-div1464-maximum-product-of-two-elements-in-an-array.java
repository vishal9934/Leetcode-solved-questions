class Solution {
    public int maxProduct(int[] nums) {
           Arrays.sort(nums);
            int ans;
            int n=nums.length;
           ans=(nums[n-1]-1) * (nums[n-2]-1);
                    return ans;
            }
        
    }