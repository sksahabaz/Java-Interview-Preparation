class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> current = new ArrayList<>();
     backtrack(0,nums,result,current);
      return result;
    }

     private void backtrack(int index,
     int nums[],  List<List<Integer>> result,List<Integer> current){


      if( index == nums.length){
        result.add(new ArrayList<>(current));
        return;
      }
    
    current.add(nums[index]);

    backtrack(index+1,nums,result,current);

    current.remove(current.size()-1);


     backtrack(index+1,nums,result,current);




     }


    
}