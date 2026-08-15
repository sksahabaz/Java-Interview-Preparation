class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st=  new Stack<>();
        for(int a : asteroids){
       while(!st.isEmpty() && a<0 && st.peek() < -a && st.peek() >0){
        st.pop();
       }  
      if(!st.isEmpty() && a<0 && st.peek() == -a){
        st.pop();
      }
    else if(st.isEmpty() || a>0 || st.peek() < 0){
        st.push(a);
    }

        }
        int ans[] = new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = st.get(i);
        }
       return ans;
    }
}