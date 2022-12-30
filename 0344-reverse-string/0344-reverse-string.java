class Solution {
    public void reverseString(char[] s) {
        
          // char ans=s[0];
           int n=s.length;
           for(int i=0;i<s.length/2;i++){
               char temp=s[i];
               s[i]=s[n-1-i];
               s[n-1-i]=temp;
           }

        
    }
}