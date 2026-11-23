class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
    
    
    
    ArrayList<Integer> result = new ArrayList<>();
    solve(0,0,arr,result);
        return result;
    }
  public static void solve(int i,int sum,int arr[],ArrayList<Integer> result){
      if(i == arr.length){
          result.add(sum);
          return;
      }
       solve(i+1,sum+arr[i],arr,result);
       solve(i+1,sum,arr,result);
      
      
  }
     
    
    
    
}