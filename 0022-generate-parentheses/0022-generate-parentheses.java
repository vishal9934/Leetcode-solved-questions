class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList();
        
        helper("(",1,0,ans,n);
        return ans;
    }
    void helper(String current,int open,int close, List<String> ans,int n){
        
        if(current.length()==n*2){
            ans.add(current);
        }
        
        if(open < n){
            helper(current + '(' ,open+1,close,ans,n);
        }
        if(close<open){
             helper(current + ')' ,open,close+1,ans,n);
        }
}
}