class Solution {
    public int findDuplicate(int[] arr, int k) {
    

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        
      if(map.containsKey(arr[i])){
          
          map.put(arr[i],map.get(arr[i])+1);
      }else{
          map.put(arr[i],1);
      }    
        
    }
     
   
   
int smallest = Integer.MAX_VALUE;
   
   for( int nums : map.keySet()){
       if(map.get(nums) == k && nums < smallest){
           smallest = nums;
       }
   }
   
   return smallest ==  Integer.MAX_VALUE ? -1 : smallest;
}
}
