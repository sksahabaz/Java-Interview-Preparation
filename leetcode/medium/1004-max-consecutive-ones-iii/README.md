# Max Consecutive Ones III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `k`, return  *the maximum number of consecutive* `1` *'s in the array if you can flip at most*  `k` `0`'s.

 

 **Example 1:** 

```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

 **Example 2:** 

```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.
- 0 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 44.48%)  
**Memory:** 52.2 MB (beats 54.78%)  
**Submitted:** 2026-09-01T09:37:51.384Z  

```java
class Solution {
    public int longestOnes(int[] nums, int k) {
        
    int maxLen =0;
    int zeroCount =0;
    int left =0;
    for(int right =0;right<nums.length;right++){
      if(nums[right] == 0){
        zeroCount++;
      }
      if(zeroCount > k){
        if(nums[left] == 0){
            zeroCount--;
        }
        left++;
      }
      maxLen = Math.max(maxLen , right-left+1);
    }
    return maxLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones-iii/)