# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.9 MB (beats 44.92%)  
**Submitted:** 2026-08-13T16:19:58.581Z  

```java
class Solution {
    public int trap(int[] height) {
        

        int n = height.length;

        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int total = 0;

        while (left < right) {

            // Always process the smaller side
            if (height[left] <= height[right]) {

                // Water can only depend on leftMax
                if (height[left] >= leftMax) {

                    // Update left maximum
                    leftMax = height[left];

                } else {

                    // Water stored
                    total += leftMax - height[left];
                }

                left++;

            } else {

                // Water depends on rightMax
                if (height[right] >= rightMax) {

                    rightMax = height[right];

                } else {

                    total += rightMax - height[right];
                }

                right--;
            }
        }

        return total;
    


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)