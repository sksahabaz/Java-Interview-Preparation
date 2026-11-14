# Count Good Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A digit string is  **good**  if the digits  **(0-indexed)**  at  **even**  indices are  **even**  and the digits at  **odd**  indices are  **prime**  (`2`, `3`, `5`, or `7`).

- For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.

Given an integer `n`, return  *the  **total**  number of good digit strings of length* `n`. Since the answer may be large,  **return it modulo** `109 + 7`.

A  **digit string**  is a string consisting of digits `0` through `9` that may contain leading zeros.

 

Original
Java
 **Example 1:** 

```
Input: n = 1
Output: 5
Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".

```

 **Example 2:** 

```
Input: n = 4
Output: 400

```

 **Example 3:** 

```
Input: n = 50
Output: 564908303

```

 

 **Constraints:** 

- 1 <= n <= 1015

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.6 MB (beats 79.60%)  
**Submitted:** 2026-11-14T12:09:36.033Z  

```java

class Solution {

    static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long power(long base, long exp) {

        // Base case
        if (exp == 0) {
            return 1;
        }

        // Recursive call
        long half = power(base, exp / 2);

        // Combine smaller results
        long result = (half * half) % MOD;

        // Handle odd exponent
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/count-good-numbers/)