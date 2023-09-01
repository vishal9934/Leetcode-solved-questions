class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
           ans[i]=helper(i);
        }
        return ans;
    }
    int helper(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        if(n%2==0)  //if n is even
        return helper(n/2);
        else        //if n is odd
       return  1+helper(n/2);
    }
}