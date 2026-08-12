# Next Greater Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return  *the  **next greater number**  for every element in*  `nums`.

The  **next greater number**  of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.

 

 **Example 1:** 

```
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 61.45%)  
**Memory:** 48.6 MB (beats 49.07%)  
**Submitted:** 2026-08-12T16:52:56.691Z  

```java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
                    int n = nums.length;
                     int[] ans = new int[n];

                  Stack<Integer> stack = new Stack<>();

       
        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

    
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

           
            if (i < n) {

                if (stack.isEmpty()) {
                    ans[i] = -1;
                } 
                else {
                    ans[i] = stack.peek();
                }
            }

            // Push current element
            stack.push(current);
        }

        return ans;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/next-greater-element-ii/)