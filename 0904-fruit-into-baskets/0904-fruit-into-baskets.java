class Solution {
    public int totalFruit(int[] fruits) {
        
        Map<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        
        int j=0;
        
        for(int i=0;i<fruits.length;i++){
            
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            
            while(mp.size()>2){
                mp.put(fruits[j],mp.get(fruits[j])-1);
                if(mp.get(fruits[j])==0){
                    mp.remove(fruits[j]);
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        
        return ans;
    }
}