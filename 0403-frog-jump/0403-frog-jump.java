class Solution {
    public boolean recursion(int currIndx,int[] stones,int n,HashMap<Integer,Integer>hmp,int prev,int[][] dp){
        if(currIndx==-1) return false;
        if(currIndx==n-1) return true;
        if(dp[currIndx][prev]!=-1) return dp[currIndx][prev]==1?true:false;
        boolean left=false,curr=false,right=false;
        if(prev>1)
            left = recursion(hmp.getOrDefault(stones[currIndx]+prev-1,-1),stones,n,hmp,prev-1,dp);
        if(prev>0)
         curr = recursion(hmp.getOrDefault(stones[currIndx]+prev,-1),stones,n,hmp,prev,dp);
        right = recursion(hmp.getOrDefault(stones[currIndx]+prev+1,-1),stones,n,hmp,prev+1,dp);  
        dp[currIndx][prev] = (left || curr || right)?1:0;
        return left || curr || right; 
    }
    public boolean canCross(int[] stones) {
        HashMap<Integer,Integer>hmp = new HashMap<>();
        int n=stones.length;
        for(int i=0;i<n;i++){
            hmp.put(stones[i],i);
        }
        int[][] dp=new int[n][2*n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return recursion(0,stones,n,hmp,0,dp);
    }
}