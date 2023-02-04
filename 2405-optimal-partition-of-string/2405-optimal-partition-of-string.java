class Solution {
    public int partitionString(String s) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                count++;
                
                //make set empty
                set=new HashSet<>();
            }
            set.add(c);
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}