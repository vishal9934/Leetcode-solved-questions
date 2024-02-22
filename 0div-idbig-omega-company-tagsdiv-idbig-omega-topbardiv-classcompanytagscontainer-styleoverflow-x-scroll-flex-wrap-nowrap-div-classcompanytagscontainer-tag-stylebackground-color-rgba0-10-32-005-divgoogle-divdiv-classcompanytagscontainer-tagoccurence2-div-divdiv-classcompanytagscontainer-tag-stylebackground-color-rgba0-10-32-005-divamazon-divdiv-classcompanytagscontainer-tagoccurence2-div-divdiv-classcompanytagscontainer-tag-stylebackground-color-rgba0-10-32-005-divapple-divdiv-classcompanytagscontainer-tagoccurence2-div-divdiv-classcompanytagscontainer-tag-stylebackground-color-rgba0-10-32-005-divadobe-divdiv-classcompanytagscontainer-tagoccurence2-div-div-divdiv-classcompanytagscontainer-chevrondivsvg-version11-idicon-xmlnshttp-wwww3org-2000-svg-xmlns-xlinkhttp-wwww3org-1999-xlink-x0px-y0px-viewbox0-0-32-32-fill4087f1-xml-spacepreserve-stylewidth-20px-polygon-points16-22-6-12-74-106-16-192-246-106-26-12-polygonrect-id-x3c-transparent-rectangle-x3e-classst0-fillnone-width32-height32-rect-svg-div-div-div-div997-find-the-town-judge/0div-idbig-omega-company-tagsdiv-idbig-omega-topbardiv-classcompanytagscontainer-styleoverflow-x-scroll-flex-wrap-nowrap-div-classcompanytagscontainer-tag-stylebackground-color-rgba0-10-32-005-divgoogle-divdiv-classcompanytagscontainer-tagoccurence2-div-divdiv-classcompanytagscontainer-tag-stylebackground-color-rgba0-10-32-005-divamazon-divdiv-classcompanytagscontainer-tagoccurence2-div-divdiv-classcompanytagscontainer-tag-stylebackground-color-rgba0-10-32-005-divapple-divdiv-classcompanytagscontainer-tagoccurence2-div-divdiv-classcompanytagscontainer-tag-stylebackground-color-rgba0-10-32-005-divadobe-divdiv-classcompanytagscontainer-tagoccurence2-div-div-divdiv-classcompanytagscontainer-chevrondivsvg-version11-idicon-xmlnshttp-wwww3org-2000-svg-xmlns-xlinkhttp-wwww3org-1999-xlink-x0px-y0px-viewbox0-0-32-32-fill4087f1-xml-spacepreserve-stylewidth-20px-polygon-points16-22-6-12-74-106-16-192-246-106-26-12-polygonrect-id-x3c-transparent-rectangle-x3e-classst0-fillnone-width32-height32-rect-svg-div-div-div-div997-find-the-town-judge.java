class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(n==1) return 1;
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<trust.length;i++){
            //add all element of 0 column bcoz cant be our ans
            set.add(trust[i][0]);
            
             //add all element of 1 column and make freqency map
          
             mp.put(trust[i][1],mp.getOrDefault(trust[i][1],0)+1);
        }
        for(int key:mp.keySet()){
            //bcoz key should be trust by everyone excep self and set cant contain that key
            if(mp.get(key)==n-1 && set.contains(key)==false){
                return key;
            }
        }
        return -1;
    }
}