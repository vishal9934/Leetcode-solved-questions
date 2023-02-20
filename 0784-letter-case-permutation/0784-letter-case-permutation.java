class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        rec(s,0,ans);
        return ans;
    }
    void rec(String s,int index,List<String> ans){
        
        ans.add(s);
        

        for(int i=index;i<s.length();i++){
            
             char charArray[]=s.toCharArray();
            
            if(Character.isLetter(s.charAt(i))) {
                
                if(Character.isUpperCase(s.charAt(i))){
                    charArray[i]=Character.toLowerCase(s.charAt(i));
                    rec(String.valueOf(charArray),i+1,ans);  
                }
                else{
                    charArray[i]=Character.toUpperCase(s.charAt(i));
                    rec(String.valueOf(charArray),i+1,ans);
                }
            }
            
        }
    }
}

