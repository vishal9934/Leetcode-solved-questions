class Solution {
    public String addBinary(String a, String b) {
        
        int n=a.length();
        int m=b.length();
        String result="";
        int i=0;
        int carry=0;
        while(i<n || i<m || carry!=0 ){
            int x=0;
            if(i<n && a.charAt(n-1-i)=='1') x=1;
            
            int y=0;
            if(i<m && b.charAt(m-1-i)=='1') y=1;
            
            result=(x+y+carry)%2 + result;
            carry=(x+y+carry)/2;
            i++;
        }
        return result;
    }
}