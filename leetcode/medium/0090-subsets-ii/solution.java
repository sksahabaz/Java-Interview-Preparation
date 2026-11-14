
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int[] nums,
        int start,
        List<Integer> path,
        List<List<Integer>> result
    ) {

        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates at the same level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            path.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, path, result);

            // Undo
            path.remove(path.size() - 1);
        }
    }
}
