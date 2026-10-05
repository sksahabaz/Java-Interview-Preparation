# Search in Rotated Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is an integer array `nums` sorted in ascending order (with  **distinct**  values).

Prior to being passed to your function, `nums` is  **possibly left rotated**  at an unknown index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1],..., nums[n-1], nums[0], nums[1],..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be left rotated by `3` indices and become `[4,5,6,7,0,1,2]`.

Given the array `nums`  **after**  the possible rotation and an integer `target`, return  *the index of* `target` *if it is in* `nums` *, or* `-1` *if it is not in* `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

```

 **Example 2:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

```

 **Example 3:** 

```
Input: nums = [1], target = 0
Output: -1

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- All values of nums are unique.
- nums is an ascending array that is possibly rotated.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-10-05T14:26:51.378Z  

```java
class Solution {
    public int search(int[] arr, int target) {
         int low = 0;
 
        // Right boundary of the current search range.
        int high = arr.length - 1;
 
        // Keep searching while a valid range still exists.
        while (low <= high) {
            // Calculate the middle index safely.
            int mid = low + (high - low) / 2;
 
            // The target is found at the middle position.
            if (arr[mid] == target) {
                return mid;
            }
 
            // Check whether the left half is normally sorted.
            if (arr[low] <= arr[mid]) {
                // The target lies inside the sorted left half.
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    // The target must lie in the other half.
                    low = mid + 1;
                }
            } else {
                // The left half is not sorted, so the right half must be sorted.
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    // The target must lie in the other half.
                    high = mid - 1;
                }
            }
        }
 
        return -1;
    }
    }

```

---

[View on LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)