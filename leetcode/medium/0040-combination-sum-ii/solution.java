
import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(
        int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0,
                  new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int[] candidates,
        int remaining,
        int start,
        List<Integer> path,
        List<List<Integer>> result) {

        // Base case
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > start &&
                candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Pruning
            if (candidates[i] > remaining) {
                break;
            }

            // 1. Choose
            path.add(candidates[i]);

            // 2. Explore: i + 1 prevents reuse
            backtrack(
                candidates,
                remaining - candidates[i],
                i + 1,
                path,
                result
            );

            // 3. Undo
            path.remove(path.size() - 1);
        }
    }
}
