class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent=new int[26];
        for(int i=0; i<26; i++)
            parent[i]=i;
        for(int i=0; i<s1.length(); i++){
            int a=parent(s1.charAt(i)-'a',parent), b=parent(s2.charAt(i)-'a',parent);
            if(a!=b){
                if(a<b)
                    parent[b]=a;
                else
                    parent[a]=b;
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:baseStr.toCharArray()){
            res.append((char)(parent(c-'a',parent)+'a'));
        }
        return res.toString();
    }
    public int parent(int i, int[] p){
        return (p[i]==i)?i:parent(p[i],p);
    }
}