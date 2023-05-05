class Solution {
    boolean isVowel(char c){
        
            
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                return true;
            }
        return false;
    }
    public int maxVowels(String s, int k) {
        
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                count++;
            }
            max=count;
        }
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);
            
        }
        return max;
    }
}