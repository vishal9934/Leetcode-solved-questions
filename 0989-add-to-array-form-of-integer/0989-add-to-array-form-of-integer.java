class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        LinkedList<Integer> ans=new LinkedList<>();
        int length=num.length-1;
        
        while(length>=0 || k!=0){
            
          if(length>=0){
              k+=num[length--];
          }
            
            ans.addFirst(k%10);
            k=k/10;
        }
        return ans;
    }
}