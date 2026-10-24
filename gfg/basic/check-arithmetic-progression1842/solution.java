class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
      
      Arrays.sort(arr);
        
       int i =0;
       int j=i+1;
       int diff = arr[j] - arr[i];   
       while(j<arr.length-1){
           
        i++;
        j++;
        if(arr[j] - arr[i] != diff){
            return false;
        }
           
       }
  
      
      return true;
      
    }
}

// diff =  arr[i] - arr[i-1]