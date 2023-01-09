class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=1;i<=n;i++){
        int row=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=1;j<=i;j++){
          list.add(row);
          row=row*(i-j)/j;
        }
        ans.add(list);
      }
      return ans;
    }
}