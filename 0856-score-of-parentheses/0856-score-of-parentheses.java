class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int score=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='('){
                st.push(score);
                score=0;
            }
            else{
                score=st.peek()+Math.max(2*score,1);
                st.pop();
            }
        }
        return score;
    }
}