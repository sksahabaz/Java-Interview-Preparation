# Combination Sum III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Find all valid combinations of `k` numbers that sum up to `n` such that the following conditions are true:

- Only numbers 1 through 9 are used.
- Each number is used at most once.

Return  *a list of all possible valid combinations*. The list must not contain the same combination twice, and the combinations may be returned in any order.

 

Original
Java
 **Example 1:** 

```
Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
```

 **Example 2:** 

```
Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.

```

 **Example 3:** 

```
Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.

```

 

 **Constraints:** 

- 2 <= k <= 9
- 1 <= n <= 60

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.9 MB (beats 87.59%)  
**Submitted:** 2026-11-14T13:07:58.582Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/combination-sum-iii/)