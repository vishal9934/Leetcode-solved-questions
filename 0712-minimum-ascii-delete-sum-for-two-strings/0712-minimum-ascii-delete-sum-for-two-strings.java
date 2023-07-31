class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return helper(s1,s2,0,0,dp);     
        
    }   
    
    private int helper(String s1,String s2,int start1,int start2,int dp[][]){
      
        if(start1==s1.length() && start2==s2.length()){
            return 0;
        }
        
        else if(start1==s1.length() && start2!=s2.length()){
            int sum=0;
            for(int i=start2;i<s2.length();i++){
                sum=sum+(int)(s2.charAt(i));
            }
            return sum;
        }
        
         else if(start1!=s1.length() && start2==s2.length()){
            int sum=0;
            for(int i=start1;i<s1.length();i++){
                sum=sum+(int)(s1.charAt(i));
            }
             return sum;
        }
        
        if(dp[start1][start2]!=-1){
            return dp[start1][start2];
        }
        /*if characters are same do nothing*/
        else if(s1.charAt(start1)==s2.charAt(start2)){
           return  dp[start1][start2]= helper(s1,s2,start1+1,start2+1,dp);
        }
		/*if characters are not same try deleting from s1 and s2 and return the minimum value*/
        else{
            int deleteFrom1= (int)(s1.charAt(start1))+helper(s1,s2,start1+1,start2,dp);
            int deleteFrom2=(int)(s2.charAt(start2))+helper(s1,s2,start1,start2+1,dp);
            return dp[start1][start2]= Math.min(deleteFrom1,deleteFrom2);
        }
    
    
    
    
    }
}