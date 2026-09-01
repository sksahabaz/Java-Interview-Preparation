class Solution {
    public String makeGood(String s) {
        
     Stack<Character> stack = new Stack<>();
     for(char ch :s.toCharArray()){
        if(!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch) && stack.peek() != ch){
            stack.pop();
        }else{
            stack.push(ch);
        }
     }   
        StringBuilder st =  new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        return st.reverse().toString();
    }
}