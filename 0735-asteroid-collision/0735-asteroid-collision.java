class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ele:asteroids){
            boolean flag=true;
            while(!st.empty() && ele<0 && st.peek()>0){
                if(st.peek()< -ele){
                    st.pop();
                }
                else if(st.peek()>-ele){
                    flag=false;
                    break;
                }
                else{
                    st.pop();  //if both is equal
                    flag=false;
                    break;
                }
            }
            if(flag){
                st.push(ele);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}