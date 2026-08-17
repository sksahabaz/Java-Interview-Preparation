class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        } 
    while(!st.isEmpty() && k>0){
        st.pop();
        k--;
    }
    StringBuilder sb = new StringBuilder();
    for(char ch : st){
        sb.append(ch);
    }

    int index = 0;
    //this will remove the trailling zeroes
    while(index < sb.length() && sb.charAt(index) == '0'){
        index++;
    }
   String ans = sb.substring(index);

   return ans.isEmpty() ?"0" : ans;


    }
}