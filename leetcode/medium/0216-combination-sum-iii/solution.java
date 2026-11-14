
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1, k, n, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int start,
        int k,
        int remaining,
        List<Integer> path,
        List<List<Integer>> result
    ) {

        // Required number of elements selected
        if (path.size() == k) {
            if (remaining == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {

            // Pruning
            if (i > remaining) {
                break;
            }

            // Choose
            path.add(i);

            // Explore: each number used once
            backtrack(
                i + 1,
                k,
                remaining - i,
                path,
                result
            );

            // Undo
            path.remove(path.size() - 1);
        }
    }
}
