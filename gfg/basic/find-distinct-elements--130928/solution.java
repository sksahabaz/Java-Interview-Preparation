class Solution {
    public int countDistinct(int arr[]) {
      
      
      LinkedHashSet<Integer> set = new LinkedHashSet<>();
      
       for( int nums : arr){
           set.add(nums);
       }
       
       return set.size();
        
    }
}