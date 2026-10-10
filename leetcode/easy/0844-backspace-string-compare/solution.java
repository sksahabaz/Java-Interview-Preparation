class Solution {
    public boolean backspaceCompare(String s, String t) {

   Stack<Character> a = new Stack<>();
   Stack<Character> b = new Stack<>();

  for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    if(ch == '#'){
        a.pop();
    }else{
        a.push(ch);
    }
  }


for(int i=0;i<t.length();i++){
    char ch = t.charAt(i);
    if(ch == '#'){
        b.pop();
    }else{
        b.push(ch);
    }
  }
   
   return a.equals(b);


    }
}