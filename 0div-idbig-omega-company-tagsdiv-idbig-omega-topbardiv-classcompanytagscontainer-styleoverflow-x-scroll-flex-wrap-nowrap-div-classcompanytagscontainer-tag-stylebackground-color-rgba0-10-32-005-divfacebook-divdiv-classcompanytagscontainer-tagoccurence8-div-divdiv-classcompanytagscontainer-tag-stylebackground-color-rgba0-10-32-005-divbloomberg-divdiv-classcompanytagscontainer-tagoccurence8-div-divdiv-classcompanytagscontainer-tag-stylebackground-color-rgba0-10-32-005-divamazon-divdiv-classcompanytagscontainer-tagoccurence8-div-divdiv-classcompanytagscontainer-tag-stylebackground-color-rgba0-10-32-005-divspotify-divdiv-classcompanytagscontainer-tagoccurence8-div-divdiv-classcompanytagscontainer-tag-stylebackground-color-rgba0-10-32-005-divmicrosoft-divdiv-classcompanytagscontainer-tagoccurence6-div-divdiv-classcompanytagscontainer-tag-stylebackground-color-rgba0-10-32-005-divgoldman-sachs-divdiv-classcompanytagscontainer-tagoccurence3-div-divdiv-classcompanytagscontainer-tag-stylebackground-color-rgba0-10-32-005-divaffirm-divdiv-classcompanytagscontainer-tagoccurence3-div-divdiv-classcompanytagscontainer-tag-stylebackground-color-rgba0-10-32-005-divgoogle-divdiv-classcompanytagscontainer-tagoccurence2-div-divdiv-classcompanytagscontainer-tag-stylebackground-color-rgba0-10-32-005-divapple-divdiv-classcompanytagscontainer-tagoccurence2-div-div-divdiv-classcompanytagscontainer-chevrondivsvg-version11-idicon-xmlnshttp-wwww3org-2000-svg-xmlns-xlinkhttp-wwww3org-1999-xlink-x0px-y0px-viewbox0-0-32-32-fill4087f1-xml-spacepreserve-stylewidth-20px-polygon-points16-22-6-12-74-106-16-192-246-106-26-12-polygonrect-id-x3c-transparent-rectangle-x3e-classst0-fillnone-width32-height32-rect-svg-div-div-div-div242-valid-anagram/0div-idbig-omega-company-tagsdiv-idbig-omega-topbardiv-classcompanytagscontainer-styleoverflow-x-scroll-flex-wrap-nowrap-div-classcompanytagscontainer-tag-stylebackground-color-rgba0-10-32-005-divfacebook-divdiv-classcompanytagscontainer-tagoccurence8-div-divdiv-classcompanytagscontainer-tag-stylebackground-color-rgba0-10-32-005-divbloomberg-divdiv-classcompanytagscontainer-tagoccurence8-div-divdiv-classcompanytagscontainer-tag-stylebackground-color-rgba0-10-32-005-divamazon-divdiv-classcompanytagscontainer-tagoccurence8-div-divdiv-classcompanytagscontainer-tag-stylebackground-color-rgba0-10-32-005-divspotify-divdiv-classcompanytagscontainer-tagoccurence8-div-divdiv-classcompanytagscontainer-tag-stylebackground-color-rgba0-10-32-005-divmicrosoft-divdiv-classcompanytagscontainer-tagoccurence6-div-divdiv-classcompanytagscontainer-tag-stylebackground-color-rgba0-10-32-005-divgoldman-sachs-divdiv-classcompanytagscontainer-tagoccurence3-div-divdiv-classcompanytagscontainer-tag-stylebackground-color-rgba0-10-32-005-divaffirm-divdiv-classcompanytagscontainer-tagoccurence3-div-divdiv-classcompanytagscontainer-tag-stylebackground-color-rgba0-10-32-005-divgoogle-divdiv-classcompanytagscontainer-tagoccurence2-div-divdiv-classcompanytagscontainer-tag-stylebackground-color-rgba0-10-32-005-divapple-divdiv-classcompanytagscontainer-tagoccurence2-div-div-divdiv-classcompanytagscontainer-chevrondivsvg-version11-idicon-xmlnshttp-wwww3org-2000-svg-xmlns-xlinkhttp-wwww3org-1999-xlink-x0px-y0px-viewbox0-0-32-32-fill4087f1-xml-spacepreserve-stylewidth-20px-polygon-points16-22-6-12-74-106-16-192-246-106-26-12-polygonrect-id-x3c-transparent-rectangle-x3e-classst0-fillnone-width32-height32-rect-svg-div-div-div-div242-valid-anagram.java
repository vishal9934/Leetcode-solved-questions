class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)
        return false;

       // HashMap<Character,Integer> mp=new HashMap<>();
       int freq[]=new int[26];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            freq[c-'a']++;
           // mp.put(c,mp.getOrDefault(c,0)+1);
        }
           for(int i=0;i<m;i++){
            char c=t.charAt(i);
             freq[c-'a']--;
           // mp.put(c,mp.getOrDefault(c,0)-1);
        }
        // for(char c:mp.keySet()){
        //     if(mp.get(c)!=0)
        //     return false;
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
            return false;
        }
        return true;
}
}