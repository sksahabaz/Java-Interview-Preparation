# Arranging Coins

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have `n` coins and you want to build a staircase with these coins. The staircase consists of `k` rows where the `ith` row has exactly `i` coins. The last row of the staircase  **may be**  incomplete.

Given the integer `n`, return  *the number of  **complete rows**  of the staircase you will build*.

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

```

 **Example 2:** 

```
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 19.14%)  
**Memory:** 42.7 MB (beats 45.92%)  
**Submitted:** 2026-09-27T14:56:04.444Z  

```java
class Solution {
    public int arrangeCoins(int n) {
        
         int row = 0;

        while (n >= row + 1) {
            row++;
            n -= row;
        }

        return row;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/arranging-coins/)