class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        for(int i=1;i<=150*n;i++){
            if(i%2==0 && i%n==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}