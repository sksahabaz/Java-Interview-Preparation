class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      
      for(int i=0;i<arr.length;i++){
          
          if(max < arr[i]){
              max = arr[i];
          }
          if( min > arr[i]){
              min = arr[i];
          }
      }
      
      ArrayList<Integer> al = new ArrayList<>();
      
      al.add(min);
      al.add(max);
      
      return al;
        
    }
}
