# Next Happy Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a non-negative integer  **n**, find the smallest Happy Number greater than n. A number is called a Happy Number if repeatedly replacing the number with the sum of the squares of its digits eventually results in 1.

 **Examples:** 

```
Input: n = 8
Output: 10
Explanation: 10 is the smallest Happy Number greater than 8, since 1² + 0² = 1.

```

```
Input: n = 10
Output: 13
Explanation: 13 is the smallest Happy Number greater than 10, since 1² + 3² = 10, and then 1² + 0² = 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T13:35:19.273Z  

```java
class Solution {
    public int nextHappy(int n) {
        int x = n + 1;
        while (!isHappy(x)) x++;        
        return x;
    }

    private boolean isHappy(int x) {
        if (x == 1) return true;           
        if (x == 4) return false;       
        return isHappy(sumSq(x));          
    }

    private int sumSq(int x) {
        if (x == 0) return 0;             
        int d = x % 10;                    
        return d * d + sumSq(x / 10);      
}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-happy-number4538/1)