class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                st.add(st.pop()+st.pop());
            }
            else if(s.equals("-")){
                 int a=st.pop();
                int b=st.pop();
                st.add(b-a);
            }
            else if(s.equals("*")){
                st.add(st.pop()*st.pop());
            }
            else if(s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.add(b/a);
            }
            else{
                st.add(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}