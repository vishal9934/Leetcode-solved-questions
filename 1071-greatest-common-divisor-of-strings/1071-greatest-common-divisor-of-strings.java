class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
  
        return str1.substring(0,gcd(n,m));
    }
    int gcd(int x,int y){
        
         if (y == 0) 
            return x;
        else 
            return gcd(y, x % y);
        
    }
}