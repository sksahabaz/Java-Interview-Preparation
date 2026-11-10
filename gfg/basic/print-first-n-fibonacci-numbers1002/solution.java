class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
    
       ArrayList<Integer> al = new ArrayList<>();
       
       int a=0,b=1;
       
       for(int i=0;i<n;i++){
         al.add(a);
         
         int c = a+b;
         a=b;
         b=c;
         
           
           
       }
    
    
    return al;
        
    }
}