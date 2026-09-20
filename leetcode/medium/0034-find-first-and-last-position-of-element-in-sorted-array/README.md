# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48 MB (beats 87.08%)  
**Submitted:** 2026-09-20T09:11:31.887Z  

```java
class Solution {

 public int lowerBound(int nums[],int target){
 
 int low = 0;
 int high = nums.length-1;
 int ans = nums.length;

 while(low<=high){
    int mid = low+(high-low)/2;
    if(nums[mid]>=target){
        ans = mid;
        high = mid-1;
    }else{
        low = mid+1;
    }
 }
 return ans;

 }
public int higherBound(int nums[],int target){
    

int low = 0;
 int high = nums.length-1;
 int ans = nums.length;

 while(low<=high){
    int mid = low+(high-low)/2;
    if(nums[mid]>target){
        ans = mid;
        high = mid-1;
    }else{
        low = mid+1;
    }
 }
 return ans;

}

    public int[] searchRange(int[] nums, int target) {
        
    int first = lowerBound(nums,target);
    if(first == nums.length || nums[first] != target){
        return new int[]{-1,-1};
    }
  
   int upper = higherBound(nums,target);
   int last = upper-1;

   return new int[]{first,last};




    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)