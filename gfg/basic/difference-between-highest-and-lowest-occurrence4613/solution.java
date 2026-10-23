class Solution {
    public int findDiff(int[] arr) {
        
        if(arr.length == 1){
            return 0;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int nums : arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
      
      
      int highest = Integer.MIN_VALUE;
      int lowest = Integer.MAX_VALUE;
      
      for(Map.Entry<Integer, Integer> entry   : map.entrySet() ){
          
          if(entry.getValue() > highest){
              highest = entry.getValue();
          } if(entry.getValue() < lowest){
              lowest = entry.getValue();
          }
          
          
          
      }
      return highest - lowest;
    }
}

