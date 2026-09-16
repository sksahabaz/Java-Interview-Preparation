class Solution {
    public int evalRPN(String[] tokens) {
        
    Stack<Integer> st = new Stack<>();

    for(String token : tokens){

    if(token.equals("+") ||
       token.equals("*") ||
       token.equals("-") ||
       token.equals("/")){

    int a = st.pop();
    int b = st.pop();

    switch (token){
    case "+":
    st.push(b+a);
     break;
     case "-":
     st.push(b-a);
     break;
     case "*":
     st.push(b*a);
     break;
     case "/":
     st.push(b/a);
     break;
    }
   
       }
        else{
        st.push(Integer.parseInt(token));
    }
    }
   return st.peek();




    }
}