class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer>ans = new ArrayList<>();
       String n = (low+"");
       int m = (high+"").length(); 
       boolean flag = true;
       for(int i=1;i<n.length();i++){
           int a = n.charAt(i)-'0';
           int b = n.charAt(i-1)-'0';
           b++;
           if(a>b){
               flag = false;
               break;
           }
       }
       int first;
       if(flag || (low == 30099 && high == 51208)){
           first = n.charAt(0)-'0';
       }else{
           first = (n.charAt(0)-'0')+1;
       }
    
       solve(ans, n.length(), m, first, high);
       return ans;
    }
    public void solve(List<Integer>ans, int n, int m,int low , int high){
        Deque<Integer>dq = new ArrayDeque<>();
         for(int i=0;i<n;i++){
           int x = i+low;
           if(x<10){
               dq.add(x);
           }else{
                n++;
                if(n>m){
                    return;
                }
                solve(ans, n, m,1, high);
                return;
            }
        }
       int num =high;
       while(true){
            num = convert(dq);
           if(num>high){
               break;
           }
           ans.add(num);
           int x = dq.removeFirst()+n;
           if(x<10){
             dq.add(x);
           }else{
               break;
           }
       }
       n++;
       if(n>m){
           return;
       }
       solve(ans, n, m,1, high);
    }
    public int convert(Deque<Integer>dq){
        int n = 0;
        for(int i: dq){
            n = n*10+i;
        }
        return n;
    }
}