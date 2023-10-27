class Solution {
    int minLeft=0;
    int maxRight=0;
    int max=0;

    void checkPalindrome(String s,int i,int j,int n){
        int left=i;
        int right=j;
        while(left>=0 && right<n &&  s.charAt(left)== s.charAt(right)){
               left--;
               right++;
        }
        int length=right-left+1;
        if(length>max){
            max=length;
            minLeft=left;
            maxRight=right;
        }
    }

    public String longestPalindrome(String s) {
        
        int n=s.length();
        //if (n == 0 || n == 1) return s;
        for(int i=0;i<n;i++){
            checkPalindrome(s,i,i,n);// for odd length
            checkPalindrome(s,i,i+1,n);// for even
        }
        return s.substring(minLeft+1,maxRight);
    }
}