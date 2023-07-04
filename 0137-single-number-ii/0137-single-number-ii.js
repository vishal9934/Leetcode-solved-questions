/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  let arr = nums;
  let length = nums.length;

  // Create a new Map object called 'mp'. A Map is a built-in JavaScript data structure that stores key-value pairs.
  let mp = new Map();
  
// Loop through the input array to count the occurrences of each number and store them in the Map.
  for (let i = 0; i < length; i++) {

    // Check if the current number already exists as a key in the Map.
    mp.set(nums[i], (mp.get(nums[i]) || 0) + 1);
  }

  // Loop through the input array again to find the number that appears only once.
  for (let i = 0; i < length; i++) {
      // Check if the current number's count in the Map is equal to 1.
    if (mp.get(arr[i]) === 1)
      return arr[i]; // If it is, return the number as it appears only once.
  }
};
