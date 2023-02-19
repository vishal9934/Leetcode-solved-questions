class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        
        rec(1,k,n,0,ans,new ArrayList<>());
        return ans;
    }
    void rec(int index,int k,int n,int sum,List<List<Integer>> ans,List<Integer> ds){
        if(sum==n && k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<=9;i++){
            ds.add(i);
            rec(i+1,k-1,n,sum+i,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}