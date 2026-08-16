# Sum of Subarray Ranges

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`. The  **range**  of a subarray of `nums` is the difference between the largest and smallest element in the subarray.

Return  *the  **sum of all**  subarray ranges of* `nums` *.* 

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 4
Explanation: The 6 subarrays of nums are the following:
[1], range = largest - smallest = 1 - 1 = 0 
[2], range = 2 - 2 = 0
[3], range = 3 - 3 = 0
[1,2], range = 2 - 1 = 1
[2,3], range = 3 - 2 = 1
[1,2,3], range = 3 - 1 = 2
So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.
```

 **Example 2:** 

```
Input: nums = [1,3,3]
Output: 4
Explanation: The 6 subarrays of nums are the following:
[1], range = largest - smallest = 1 - 1 = 0
[3], range = 3 - 3 = 0
[3], range = 3 - 3 = 0
[1,3], range = 3 - 1 = 2
[3,3], range = 3 - 3 = 0
[1,3,3], range = 3 - 1 = 2
So the sum of all ranges is 0 + 0 + 0 + 2 + 0 + 2 = 4.

```

 **Example 3:** 

```
Input: nums = [4,-2,-3,4,1]
Output: 59
Explanation: The sum of all subarray ranges of nums is 59.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- -109 <= nums[i] <= 109

 

 **Follow-up:**  Could you find a solution with `O(n)` time complexity?

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 48.54%)  
**Memory:** 46.8 MB (beats 22.89%)  
**Submitted:** 2026-08-16T11:54:04.858Z  

```java
import java.util.Stack;

class Solution {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        long maxSum = getMaxContribution(nums, n);
        long minSum = getMinContribution(nums, n);

        return maxSum - minSum;
    }

    // Sum of contributions when each element acts as MAXIMUM
    private long getMaxContribution(int[] nums, int n) {

        int[] prevGreater = new int[n];
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Greater (strictly greater)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            prevGreater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater (greater or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            nextGreater[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - prevGreater[i];
            long right = nextGreater[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }

    // Sum of contributions when each element acts as MINIMUM
    private long getMinContribution(int[] nums, int n) {

        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Previous Smaller (strictly smaller)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Smaller (smaller or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - prevSmaller[i];
            long right = nextSmaller[i] - i;

            sum += (long) nums[i] * left * right;
        }

        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-subarray-ranges/)