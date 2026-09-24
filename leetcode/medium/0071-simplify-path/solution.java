class Solution {
    public String simplifyPath(String path) {
        String parts[] = path.split("/");
         
          Deque<String> stack = new ArrayDeque<>();

          for(String part : parts){
           if(part.isEmpty() || part.equals(".")){
            continue;
           }
           if(part.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
           }else{
            stack.push(part);
           }


          }

          StringBuilder res = new StringBuilder();
          while(!stack.isEmpty()){
            res.append("/").append(stack.removeLast());
          }
        return res.length() == 0 ? "/" : res.toString();
    }
}