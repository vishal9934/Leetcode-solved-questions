/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function(nums) {
    let i=0;
    let j=0;
    let count=0;
    let ans=0;
    
    for(;j<nums.length;j++){
        
        if(nums[j]===0) count++;
        
        while(count>1){
            if(nums[i]===0){
                count--;
            }
            
            i++;
                
        }
       ans=Math.max(ans,j-i);
    }
    return ans;
};