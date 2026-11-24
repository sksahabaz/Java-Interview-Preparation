# Count Subset with Sum - Limited Size

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  and an integer  **k**, find the count of subsets whose sum is equals to k.

 **Note** : Array size is small and allowed values are larger in this problem when compared to Count Subsets with Sum

 **Examples:** 

```
Input: arr[] = [1, 3, 2], k = 3
Output: 2
Explanation: The two subsets whose sum is equals to k are [1, 2] and [3].

```

```
Input: arr[] = [4, 2, 3, 1, 2], k = 4
Output: 3
Explanation: The three subsets whose sum is equals to k are [4], [2, 2] and [3, 1].

```

```
Input: arr[] = [10, 20, 30], k = 25
Output: 0
Explanation: No subsets exits with sum equals to k.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T13:08:58.753Z  

```java
class Solution {
    public int countSubset(int[] arr, int k) {
        int n = arr.length, mid = n / 2;
        Map<Long, Integer> left = new HashMap<>();
        Map<Long, Integer> right = new HashMap<>();
        collect(arr, 0, mid, 0L, left);       // all subset sums of left half
        collect(arr, mid, n, 0L, right);      // all subset sums of right half

        long ans = 0;
        for (Map.Entry<Long, Integer> e : right.entrySet()) {
            long need = k - e.getKey();       // left part must give this
            ans += (long) e.getValue() * left.getOrDefault(need, 0);
        }
        return (int) ans;
    }

    // Subset Sums recursion: pick / skip, store each final sum in the map
    private void collect(int[] arr, int i, int end, long sum, Map<Long, Integer> map) {
        if (i == end) {
            map.merge(sum, 1, Integer::sum);  // count how many times this sum appears
            return;
        }
        collect(arr, i + 1, end, sum + arr[i], map);  // pick
        collect(arr, i + 1, end, sum, map);           // skip
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-subset-with-sum-equal-to-k/1)