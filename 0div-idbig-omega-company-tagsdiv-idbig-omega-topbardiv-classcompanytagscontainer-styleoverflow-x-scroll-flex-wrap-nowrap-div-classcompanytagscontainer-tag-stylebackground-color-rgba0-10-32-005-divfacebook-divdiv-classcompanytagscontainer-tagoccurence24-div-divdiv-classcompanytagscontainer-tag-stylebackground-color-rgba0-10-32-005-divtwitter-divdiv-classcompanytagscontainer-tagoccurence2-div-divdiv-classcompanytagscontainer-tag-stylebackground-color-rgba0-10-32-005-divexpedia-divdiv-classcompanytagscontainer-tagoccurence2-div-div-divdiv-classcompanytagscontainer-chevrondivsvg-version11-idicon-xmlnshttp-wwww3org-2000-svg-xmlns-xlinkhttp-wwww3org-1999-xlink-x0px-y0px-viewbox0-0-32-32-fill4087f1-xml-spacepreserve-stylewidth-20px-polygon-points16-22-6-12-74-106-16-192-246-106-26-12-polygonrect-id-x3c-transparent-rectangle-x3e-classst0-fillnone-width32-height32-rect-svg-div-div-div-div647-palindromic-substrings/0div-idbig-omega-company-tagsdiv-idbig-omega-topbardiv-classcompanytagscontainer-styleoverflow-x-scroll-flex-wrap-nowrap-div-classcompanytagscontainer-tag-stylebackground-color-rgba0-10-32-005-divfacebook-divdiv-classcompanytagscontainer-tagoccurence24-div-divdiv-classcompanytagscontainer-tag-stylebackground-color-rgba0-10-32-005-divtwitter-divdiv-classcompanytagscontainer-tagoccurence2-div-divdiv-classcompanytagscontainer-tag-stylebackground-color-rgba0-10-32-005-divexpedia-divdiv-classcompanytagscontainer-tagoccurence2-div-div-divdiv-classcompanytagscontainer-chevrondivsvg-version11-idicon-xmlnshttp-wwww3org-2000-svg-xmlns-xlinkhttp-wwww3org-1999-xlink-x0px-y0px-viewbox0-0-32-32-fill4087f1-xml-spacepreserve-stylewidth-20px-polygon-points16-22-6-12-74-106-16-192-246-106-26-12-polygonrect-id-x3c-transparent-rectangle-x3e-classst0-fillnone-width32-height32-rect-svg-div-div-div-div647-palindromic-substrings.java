class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                String str=s.substring(start,end+1);
                boolean ans=isPalindrome(str);
                if(ans==true){
                count++;
                }
            }
        }
        return  count;
    }

     public boolean isPalindrome(String s){

        int st=0,end=s.length()-1;
        while (st<end){

            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;

        }
        return true;

    }
}