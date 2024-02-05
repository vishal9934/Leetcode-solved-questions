class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Initialize the frequency array
        int[] frequency = new int[26];
        
        // Step 2: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        
        // Step 3: Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }
}