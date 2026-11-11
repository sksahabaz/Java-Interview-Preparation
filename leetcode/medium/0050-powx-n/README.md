# Pow(x, n)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement pow(x, n), which calculates `x` raised to the power `n` (i.e., `xn`).

 

Original
Java
 **Example 1:** 

```
Input: x = 2.00000, n = 10
Output: 1024.00000

```

 **Example 2:** 

```
Input: x = 2.10000, n = 3
Output: 9.26100

```

 **Example 3:** 

```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

```

 

 **Constraints:** 

- -100.0 < x < 100.0
- -231 <= n <= 231-1
- n is an integer.
- Either x is not zero or n > 0.
- -104 <= xn <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 37.60%)  
**Memory:** 47 MB (beats 95.23%)  
**Submitted:** 2026-11-11T14:34:59.782Z  

```java

class Solution {
    public double myPow(double x, int n) {

        long power = n;

        boolean negative = power < 0;

        if (negative) {
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {

            if (power % 2 == 1) {
                result *= x;
            }

            x *= x;
            power /= 2;
        }

        if (negative) {
            result = 1.0 / result;
        }

        return result;
    }
}


```

---

[View on LeetCode](https://leetcode.com/problems/powx-n/)