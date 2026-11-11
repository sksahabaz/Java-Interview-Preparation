class Solution {
    public List<String> generateParenthesis(int n) {
         
     List<String> result = new ArrayList<>();
     StringBuilder current = new StringBuilder();
     backtrack(result,current,0,0,n);

     return result;
    }
 
  private void backtrack(List<String> result
  ,StringBuilder current,int open,int close,int n){


    if(current.length() == 2*n){
        result.add(current.toString());
        return;
    }
 
    //choice-1
    if(open < n){

   current.append("(");
   backtrack(result,current,open+1,close,n);
    
    current.deleteCharAt(current.length()-1);
   
    }

   //choice 2

   if(close < open){
 

   current.append(")");
   backtrack(result,current,open,close+1,n);

   current.deleteCharAt(current.length()-1);

   }


  }
 


}