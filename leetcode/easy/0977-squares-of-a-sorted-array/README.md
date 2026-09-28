# Squares of a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` sorted in  **non-decreasing**  order, return  *an array of  **the squares of each number**  sorted in non-decreasing order*.

 

 **Example 1:** 

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

```

 **Example 2:** 

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.

 

 **Follow up:**  Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 47.1 MB (beats 75.07%)  
**Submitted:** 2026-09-28T14:01:38.610Z  

```java
class Solution {
    public int[] sortedSquares(int[] nums) {

    int n = nums.length;
    int square[] = new int[n];

    int left = 0;
    int right = n-1;
    int pos = n-1;

    while(left<=right){
   
   if(Math.abs(nums[left]) > Math.abs(nums[right])){

 square[pos] = nums[left]*nums[left];
 left++;

   }else{
    square[pos]  = nums[right]*nums[right];
    right--;
   }


  pos--;


    }
  return square;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)