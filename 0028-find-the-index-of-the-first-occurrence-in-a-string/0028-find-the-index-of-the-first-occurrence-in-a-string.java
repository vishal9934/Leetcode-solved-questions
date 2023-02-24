class Solution {
    boolean compare(String haystack,String needle,int index){
        int n1=haystack.length();
        int n2=needle.length();
        for(int i=0;i<n2;i++){
            if(index>=n1) return false;
            
            if(haystack.charAt(index++)!=needle.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public int strStr(String haystack, String needle) {

        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){  //agar 1st char mil jaye in haystak then start checking
                if(compare(haystack,needle,i)){
                    return i;
                }
                
            }
        }
        return -1;
    }
}
