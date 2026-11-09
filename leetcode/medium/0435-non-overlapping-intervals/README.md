# Non-overlapping Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of intervals `intervals` where `intervals[i] = [starti, endi]`, return  *the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping*.

 **Note**  that intervals which only touch at a point are  **non-overlapping**. For example, `[1, 2]` and `[2, 3]` are non-overlapping.

 

 **Example 1:** 

```
Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.

```

 **Example 2:** 

```
Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.

```

 **Example 3:** 

```
Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.

```

 

 **Constraints:** 

- 1 <= intervals.length <= 105
- intervals[i].length == 2
- -5  *104 <= starti < endi <= 5*  104

## Solution

**Language:** Java  
**Runtime:** 49 ms (beats 33.59%)  
**Memory:** 115.1 MB (beats 89.86%)  
**Submitted:** 2026-11-09T14:09:44.548Z  

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;
        int lastEnd = intervals[0][1];          // end of last KEPT interval

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];          // end of CURRENT interval

            if (start >= lastEnd) {
                lastEnd = end;                  // keep it, room free later now
            } else {
                removed++;                      // clash, remove it
            }
        }
        return removed;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/non-overlapping-intervals/)