# Combination Sum II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sum to `target`.

Each number in `candidates` may only be used  **once**  in the combination.

 **Note:**  The solution set must not contain duplicate combinations.

 

Original
Java
 **Example 1:** 

```
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

```

 **Example 2:** 

```
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]

```

 

 **Constraints:** 

- 1 <= candidates.length <= 100
- 1 <= candidates[i] <= 50
- 1 <= target <= 30

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 76.48%)  
**Memory:** 44.8 MB (beats 77.75%)  
**Submitted:** 2026-11-14T13:06:15.230Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/combination-sum-ii/)