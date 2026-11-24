class Solution {
  public static boolean isLucky(int n) {
      return check(n, 2);
  }
  
  static boolean check(int pos,int k){
      if( k> pos){
          return true;
      }
      
      if(pos%k == 0){
          return false;
      }
      
      return check(pos-pos/k,k+1);
      
  }
  
  
}