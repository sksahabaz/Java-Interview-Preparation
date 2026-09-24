class Solution {
    public String decodeString(String s) {
       
        Deque<Integer>  integerStack = new ArrayDeque<>();
        Deque<String>   stringStack = new ArrayDeque<>();

        int number =0;
        StringBuilder current = new StringBuilder();

        for(char c: s.toCharArray()){
        
         if(Character.isDigit(c)){
            number = number * 10 + (c -'0');
         }
          else if(c == '['){
            
         integerStack.push(number);
         stringStack.push(current.toString());
         
         number =0;
         current = new StringBuilder();
          }
        
              else if( c == ']'){
             int repeat = integerStack.pop();
             String previous = stringStack.pop();
             
             StringBuilder temp = new StringBuilder(previous);

             for(int i=0;i<repeat;i++){
                temp.append(current);
             }
              current = temp;

              }
                else{
                    current.append(c);
                }
          
        }


      return current.toString();



    }
}