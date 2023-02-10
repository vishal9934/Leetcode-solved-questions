class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        
        for(String s:strs){
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
            
        }
        return new ArrayList<>(mp.values());
    }
}