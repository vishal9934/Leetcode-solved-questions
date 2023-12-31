class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // Array to track the first occurrence index of each character (-1 if not seen yet)
        int[] firstOccurrenceOfLetter = new int[26];
        Arrays.fill(firstOccurrenceOfLetter, -1);

        // Initialize maximum substring length to -1
        int maxLength = -1;

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charIndex = currentChar - 'a';

            // If this is the first occurrence of the character, store its index
            if (firstOccurrenceOfLetter[charIndex] == -1) {
                firstOccurrenceOfLetter[charIndex] = i;
            } else {
                // If it's a repeated character, calculate the substring length between occurrences
                int substringLength = i - firstOccurrenceOfLetter[charIndex] - 1;

                // Exclude the two characters themselves
                // Update the maximum length if necessary
                maxLength = Math.max(maxLength, substringLength);
            }
        }

        // Return the maximum length found, or -1 if no valid substring exists
        return maxLength;
    }
}