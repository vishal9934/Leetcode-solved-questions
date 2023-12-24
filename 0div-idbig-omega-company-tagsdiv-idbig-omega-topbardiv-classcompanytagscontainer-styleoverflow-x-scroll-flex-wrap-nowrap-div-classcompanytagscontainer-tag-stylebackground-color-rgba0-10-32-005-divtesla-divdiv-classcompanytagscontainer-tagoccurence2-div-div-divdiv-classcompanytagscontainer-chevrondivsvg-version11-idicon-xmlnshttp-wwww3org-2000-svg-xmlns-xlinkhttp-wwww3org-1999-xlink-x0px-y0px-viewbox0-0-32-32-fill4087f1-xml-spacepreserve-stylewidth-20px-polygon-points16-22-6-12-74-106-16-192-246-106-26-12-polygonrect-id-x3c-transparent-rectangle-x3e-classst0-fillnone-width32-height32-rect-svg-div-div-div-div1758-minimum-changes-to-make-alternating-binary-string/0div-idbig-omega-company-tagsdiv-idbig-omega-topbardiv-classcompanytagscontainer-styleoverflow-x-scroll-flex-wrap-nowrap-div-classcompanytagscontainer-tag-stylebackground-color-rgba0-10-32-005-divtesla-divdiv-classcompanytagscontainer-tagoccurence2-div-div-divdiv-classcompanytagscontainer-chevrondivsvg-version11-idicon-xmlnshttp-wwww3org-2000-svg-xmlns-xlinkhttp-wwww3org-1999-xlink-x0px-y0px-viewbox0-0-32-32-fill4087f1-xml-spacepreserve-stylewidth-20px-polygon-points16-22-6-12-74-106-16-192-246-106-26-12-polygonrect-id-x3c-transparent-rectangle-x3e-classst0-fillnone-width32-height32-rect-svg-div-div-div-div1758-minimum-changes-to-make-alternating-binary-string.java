class Solution {
    public int minOperations(String s) {
        int d=0,e=0,i=0;
        for(i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                if(s.charAt(i)!='0')
                d++;
                else
                e++;
            }
            else{
                if(s.charAt(i)!='1')
                d++;
                else
                e++;
            }
        }
        return Math.min(d,e);
    }
}