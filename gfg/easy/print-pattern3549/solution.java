class Solution {
    public ArrayList<Integer> pattern(int n) {
      
      ArrayList<Integer> list = new ArrayList<>();
      
      solve(n,list);
      return list;
        
    }
    
    public static void solve(int n, ArrayList<Integer> list){
        
    list.add(n);
    if(n<=0){
        return;
    }
    
    solve(n-5,list);
    list.add(n);
        
        
        
    }
}