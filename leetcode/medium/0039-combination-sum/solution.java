
import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int[] candidates,
        int remaining,
        int start,
        List<Integer> path,
        List<List<Integer>> result
    ) {

        // Base case: target achieved
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Explore available candidates
        for (int i = start; i < candidates.length; i++) {

            // Pruning: no larger candidate can work
            if (candidates[i] > remaining) {
                break;
            }

            // 1. Choose
            path.add(candidates[i]);

            // 2. Explore (same index allows reuse)
            backtrack(
                candidates,
                remaining - candidates[i],
                i,
                path,
                result
            );

            // 3. Undo choice
            path.remove(path.size() - 1);
        }
    }
}
