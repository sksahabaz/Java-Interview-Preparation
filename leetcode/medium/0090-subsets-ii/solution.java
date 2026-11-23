class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(0,nums,new ArrayList<>(),result);
        return result;
    }

    public static void solve(int i,int[] nums,List<Integer> current,List<List<Integer>> result){

    if(i == nums.length){
        result.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[i]);
    solve(i+1,nums,current,result);
    current.remove(current.size()-1);

    int j = i+1;
    while(j<nums.length && nums[j] == nums[i]) j++;
    
        solve(j,nums,current,result);



    }
}