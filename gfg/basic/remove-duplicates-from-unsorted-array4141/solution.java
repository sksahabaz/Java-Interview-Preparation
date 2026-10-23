class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        
        for(int nums : arr){
            set.add(nums);
        }
        
        
        
        
           ArrayList<Integer> al = new ArrayList<>(set);
           
           return al;
        
        
        
        
    }
}