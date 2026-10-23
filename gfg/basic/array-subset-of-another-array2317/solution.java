
class Solution {
    public boolean isSubset(int a[], int b[]) {
       
       
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int nums : a ){
           map.put(nums,map.getOrDefault(nums,0)+1);
       }
       
           for(int nums : b){
               if(map.containsKey(nums) && map.get(nums)>0){
                   map.put(nums,map.get(nums)-1);
               }else{
                   return false;
               }
           }
       return true;
        
    }
}
