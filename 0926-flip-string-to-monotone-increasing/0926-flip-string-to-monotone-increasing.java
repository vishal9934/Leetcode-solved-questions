class Solution {
    public int minFlipsMonoIncr(String s) {
        int oneCount=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oneCount++;
            }
            else{
                ans=Math.min(ans+1,oneCount);
            }
        }
        return ans;
    }
}