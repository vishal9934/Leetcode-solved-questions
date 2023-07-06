/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    
    let min=Number.MAX_VALUE;
    let i=0;
    let j=0;
    let sum=0;
    
    while(j<=nums.length){
         sum+=nums[j++];
      
        
        while(sum>=target){
            min=Math.min(min,j-i);
            sum-=nums[i++];
        }
    }
    return min===Number.MAX_VALUE?0:min;
    
};