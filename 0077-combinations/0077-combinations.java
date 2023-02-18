class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        
         rec(1,n,ans, new ArrayList(),k );
        return ans;
    }
    void rec(int index,int n, List<List<Integer>> ans, List<Integer> ds,int k){
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<=n;i++){
            ds.add(i);
            rec(i+1,n,ans,ds,k);
            ds.remove(ds.size()-1);
        }
    }
}