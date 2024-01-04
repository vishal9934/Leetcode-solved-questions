class Solution {
    public int minOperations(int[] nums) 
    {
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int current = entry.getValue();
            if (current == 1) return -1;
            count += current / 3;
            if (current % 3 != 0) count++;
        }
        // If current%3 == 0 divisible by 3
        // If current%3 == 1 [Then we reduce by 3 till we have the value 4 and then subtract 2 twice ---> ((current/3)-1)+2 -----> current/3 + 1 ] 
        // If current%3 == 2 [Then we reduce by 3 till we have the value 2 and then subtract 2 once ---> current/3 + 1 ]  

        return count;
    }
}