# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

 **Example 1:** 

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.7 MB (beats 42.51%)  
**Submitted:** 2026-10-08T16:04:35.519Z  

```java
class Solution {
    public int mySqrt(int x) {
        
   int low =1;
   int high = x;

   while(low<=high){
   int mid = low+(high-low)/2;
   if((long)mid*mid <= x){
    low = mid+1;
   }else{
    high = mid-1;
   }

   }
   return high;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)