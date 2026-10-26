class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
     
     
     LinkedHashSet<Integer> set = new LinkedHashSet<>();
     
     
     for(int num : a){
         set.add(num);
     }
     
     for(int num : b){
         set.add(num);
     }
     
     
     
     
     
     return new ArrayList<>(set);
     
    //  for(int num : b){
    //      if(al.contains(num)){
    //         continue; 
    //      }else{
    //          al.add(num);
    //      }
    //  }
        
        // return al;
    }
}