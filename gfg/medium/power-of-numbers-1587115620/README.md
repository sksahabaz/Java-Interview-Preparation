# Raise to Power of Its Own Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number **n**, find the value of  **n**  raised to the power of its own reverse. The result will always fit into a 32-bit signed integer.

 **Examples:** 

```
Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and.
```

```
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T12:41:23.537Z  

```java
class Solution {
    public int reverseExponentiation(int n) {
        int rev = reverse(n, 0);
        return power(n, rev);
    }

    // builds the reversed number in acc
    private int reverse(int n, int acc) {
        if (n == 0) return acc;                     // no digits left
        return reverse(n / 10, acc * 10 + n % 10);  // move last digit to acc
    }

    // fast power: n^p in O(log p)
    private int power(int n, int p) {
        if (p == 0) return 1;
        int half = power(n, p / 2);                 // compute ONCE
        if (p % 2 == 0) return half * half;
        return n * half * half;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1)