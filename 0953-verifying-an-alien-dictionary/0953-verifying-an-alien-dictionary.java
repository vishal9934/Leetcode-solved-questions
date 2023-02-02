class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // map like this
        // h->1
        // l->2
        // a->3    
        int map[]=new int[26];
        int freq=0;
        for(int i=0;i<order.length();i++){
            map[order.charAt(i)-'a']=i;
        }
        
        for(int i=1;i<words.length;i++){
            String first=words[i-1];
            String second=words[i];
            int len=Math.min(first.length(),second.length());
            boolean flag=false;
            for(int j=0;j<len;j++){
                if(map[first.charAt(j)-'a']>map[second.charAt(j)-'a']){
                    return false;
                }
                else if(map[first.charAt(j)-'a']<map[second.charAt(j)-'a']){
                    flag=true;
                    break;
                }
            }
            if(!flag && first.length()>second.length()){
                return false;
            }
        }
        return true;
    }
}