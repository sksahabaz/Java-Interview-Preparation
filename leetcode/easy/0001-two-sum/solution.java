import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        HashMap<Integer,Integer>  mpp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(mpp.containsKey(complement)){
            return new int[] { mpp.get(complement), i };
            }else{
                mpp.put(nums[i],i);
            }
        }
       return new  int[] {-1,-1};
    }
}