# Subsets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` that may contain duplicates, return  *all possible*   *subsets** (the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.71%)  
**Memory:** 44.8 MB (beats 67.48%)  
**Submitted:** 2026-11-14T13:07:41.059Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/subsets-ii/)