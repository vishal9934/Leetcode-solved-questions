class Solution {
    public String minWindow(String s, String t) {
        int[] charCount = new int[128];  // Array to store the count of characters
        int requiredChars = t.length();  // Number of characters required to form the window
        int bestLeftIndex = -1;          // Starting index of the best window
        int minWindowSize = s.length() + 1;  // Minimum window size

        // Initializing charCount array with counts of characters in string 't'
        for (char c : t.toCharArray())
            ++charCount[c];

        // Sliding window approach
        for (int left = 0, right = 0; right < s.length(); ++right) {
            // Update charCount and requiredChars based on the character at the right pointer
            if (--charCount[s.charAt(right)] >= 0)
                --requiredChars;

            // Checking if the window contains all required characters
            while (requiredChars == 0) {
                // Updating the best window if the current window is smaller
                if (right - left + 1 < minWindowSize) {
                    bestLeftIndex = left;
                    minWindowSize = right - left + 1;
                }

                // Moving the left pointer and update charCount and requiredChars
                if (++charCount[s.charAt(left++)] > 0)
                    ++requiredChars;
            }
        }

        // Returning the minimum window substring or an empty string if no such window exists
        return bestLeftIndex == -1 ? "" : s.substring(bestLeftIndex, bestLeftIndex + minWindowSize);
    }
}