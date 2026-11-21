# Recursive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, compute the value of  **F(n)**  where F(n) is defined as: F(n) = (1) + (2×3) + (4×5×6) + (7×8×9×10) + …up to n terms. 

 **Note:** As the answer can be very large, return the answer modulo 109+7.

 **Examples:** 

```
Input: n = 5
Output: 365527
Explanation: F(5) = 1 + 2 *3 + 4* 5 *6 + 7* 8 *9* 10 + 11 *12* 13 *14* 15 = 365527.
```

```
Input: n = 7
Output: 6997165
Explanation: F(7) = 1 + 2 *3 + 4* 5 *6 + 7* 8 *9* 10 + 11 *12* 13 *14* 15 + 16 *17* 18 *19* 20 *21 + 22* 23 *24* 25 *26* 27*28 = 6006997207.
6006997207 % 109+7 = 6997165
```

 **Constraints:** 
1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:46:48.401Z  

```java
class Solution {
    static final long MOD = 1000000007;

    static long sequence(int n) {
        return solve(1, 1, n);
    }

    // sum of terms i..n, where term i starts at 'start'
    static long solve(int i, long start, int n) {
        if (i > n) return 0;                          // no terms left
        long term = product(start, i);                // this term
        long rest = solve(i + 1, start + i, n);       // remaining terms
        return (term + rest) % MOD;
    }

    // multiply 'count' consecutive numbers starting at 'start'
    static long product(long start, int count) {
        if (count == 0) return 1;
        return (start % MOD) * product(start + 1, count - 1) % MOD;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/recursive-sequence1611/1)