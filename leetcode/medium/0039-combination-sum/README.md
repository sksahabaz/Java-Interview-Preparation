# Combination Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of  **distinct**  integers `candidates` and a target integer `target`, return  *a list of all  **unique combinations**  of* `candidates` *where the chosen numbers sum to* `target` *.*  You may return the combinations in  **any order**.

The  **same**  number may be chosen from `candidates` an  **unlimited number of times**. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

 

Original
Java
 **Example 1:** 

```
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

```

 **Example 2:** 

```
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

```

 **Example 3:** 

```
Input: candidates = [2], target = 1
Output: []

```

 

 **Constraints:** 

- 1 <= candidates.length <= 30
- 2 <= candidates[i] <= 40
- All elements of candidates are distinct.
- 1 <= target <= 40

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 13.56%)  
**Memory:** 45.4 MB (beats 60.52%)  
**Submitted:** 2026-11-14T12:47:54.908Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/combination-sum/)