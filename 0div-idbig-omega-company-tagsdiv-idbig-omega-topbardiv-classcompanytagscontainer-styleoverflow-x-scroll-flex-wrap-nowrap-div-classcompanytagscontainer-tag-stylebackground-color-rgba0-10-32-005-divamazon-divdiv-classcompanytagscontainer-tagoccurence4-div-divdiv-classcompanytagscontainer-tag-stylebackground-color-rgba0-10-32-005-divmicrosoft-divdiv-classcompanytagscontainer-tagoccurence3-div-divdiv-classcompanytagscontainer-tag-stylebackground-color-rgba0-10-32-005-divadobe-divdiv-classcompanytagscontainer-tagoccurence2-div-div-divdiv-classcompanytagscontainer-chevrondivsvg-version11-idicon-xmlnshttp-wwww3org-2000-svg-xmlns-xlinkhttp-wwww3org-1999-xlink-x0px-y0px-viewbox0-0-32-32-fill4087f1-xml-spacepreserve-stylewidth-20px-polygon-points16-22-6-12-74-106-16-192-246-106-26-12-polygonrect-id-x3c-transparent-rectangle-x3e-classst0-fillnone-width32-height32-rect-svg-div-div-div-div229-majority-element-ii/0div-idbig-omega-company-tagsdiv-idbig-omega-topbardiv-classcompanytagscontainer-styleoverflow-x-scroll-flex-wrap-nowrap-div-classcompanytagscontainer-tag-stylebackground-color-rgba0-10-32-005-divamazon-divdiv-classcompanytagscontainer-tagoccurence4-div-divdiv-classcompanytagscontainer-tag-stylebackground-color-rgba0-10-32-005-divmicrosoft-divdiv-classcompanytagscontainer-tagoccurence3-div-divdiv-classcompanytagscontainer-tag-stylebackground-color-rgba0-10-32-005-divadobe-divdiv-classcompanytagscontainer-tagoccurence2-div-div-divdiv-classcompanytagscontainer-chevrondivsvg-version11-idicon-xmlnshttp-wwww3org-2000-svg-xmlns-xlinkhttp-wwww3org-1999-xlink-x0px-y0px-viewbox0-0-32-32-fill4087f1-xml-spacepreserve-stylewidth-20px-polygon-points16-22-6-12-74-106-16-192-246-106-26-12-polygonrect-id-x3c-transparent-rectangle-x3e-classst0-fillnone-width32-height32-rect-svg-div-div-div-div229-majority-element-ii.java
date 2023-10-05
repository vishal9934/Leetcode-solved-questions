class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++)
        {
            int count = 1 , num = nums[i];
            while (i < (nums.length-1) && num == nums[i+1])
            {
                count++;
                i++;
            }
            if (count > nums.length/3) list.add(num);
        }
        return list;
    }
}