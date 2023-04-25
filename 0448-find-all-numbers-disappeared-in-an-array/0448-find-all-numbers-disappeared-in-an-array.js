/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let arr=[];
    for(let i=0;i<nums.length;i++){
        let index=Math.abs(nums[i]);
        nums[index-1]=nums[index-1]<0?nums[index-1]:-1*nums[index-1];
    }
    for(let i=0;i<nums.length;i++){
        if(nums[i]>0){
            arr.push(i+1);
        }
    }
    return arr;
};