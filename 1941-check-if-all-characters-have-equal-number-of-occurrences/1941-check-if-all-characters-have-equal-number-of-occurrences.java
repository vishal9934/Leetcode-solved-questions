class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        int prev=freq[s.charAt(0)-'a'];
        for(int c:freq){
            if(c!=0 && c!=prev){
                return false;
            }
        }
        return true;
    }
}