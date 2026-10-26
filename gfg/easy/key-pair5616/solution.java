class Solution {
    boolean twoSum(int arr[], int target) {
        
        HashSet<Integer> set  = new HashSet<>();
        
        for(int num : arr){
            
         int required = target-num;
         if(set.contains(required)){
             return true;
         }
            
            
            set.add(num);
        }
        
        return false;
    }
}