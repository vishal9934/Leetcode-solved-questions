class Solution {
    public char findTheDifference(String s, String t) {
         int sum = 0;
        int sum2 = 0;
        
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }
        
        for (int i = 0; i < s.length(); i++) {
            sum2 += s.charAt(i);
        }
        
        return (char) (sum - sum2);
    }
}