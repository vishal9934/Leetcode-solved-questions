class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int round=0;

        for(int i=0;i<tasks.length;i++){
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }

        for(int x:mp.keySet()){
            if(mp.get(x)==2) round++;

            else if(mp.get(x)<=1) return -1;

            else{
               double res= mp.get(x)/3.0;
               round+=Math.ceil(res);
            }
        }
        return round;
    }
}