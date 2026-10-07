# Single Element in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return  *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

 **Example 1:** 

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 53 MB (beats 39.41%)  
**Submitted:** 2026-10-07T16:09:05.284Z  

```java
class Solution {
    public int singleNonDuplicate(int[] arr) {


 int low = 0;
 
        // Right boundary of the current search range.
        int high = arr.length - 1;
 
        // Keep shrinking the range until only one position remains.
        while (low < high) {
            // Calculate the middle index safely.
            int mid = low + (high - low) / 2;
 
            // Move to the first index of the expected pair.
            if (mid % 2 == 1) {
                mid--;
            }
 
            // A proper pair means the single element is further right.
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                // The broken pair means the answer is at mid or to the left.
                high = mid;
            }
        }
 
        return arr[low];
   
   



    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)