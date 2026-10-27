class Solution {
    public int getSecondLargest(int[] arr) {
      
      Arrays.sort(arr);
      
      for(int i=arr.length-2;i>=0;i--){
          if(arr[i] != arr[arr.length-1]){
              return arr[i];
          }
      }
      
      return -1;
      
        
    }
}