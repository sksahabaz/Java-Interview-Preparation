# Grumpy Bookstore Owner

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a bookstore owner that has a store open for `n` minutes. You are given an integer array `customers` of length `n` where `customers[i]` is the number of the customers that enter the store at the start of the `ith` minute and all those customers leave after the end of that minute.

During certain minutes, the bookstore owner is grumpy. You are given a binary array grumpy where `grumpy[i]` is `1` if the bookstore owner is grumpy during the `ith` minute, and is `0` otherwise.

When the bookstore owner is grumpy, the customers entering during that minute are not  **satisfied**. Otherwise, they are satisfied.

The bookstore owner knows a secret technique to remain  **not grumpy**  for `minutes` consecutive minutes, but this technique can only be used  **once**.

Return the  **maximum**  number of customers that can be  *satisfied*  throughout the day.

 

 **Example 1:** 

 **Input:**  customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3

 **Output:**  16

 **Explanation:** 

The bookstore owner keeps themselves not grumpy for the last 3 minutes.

The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.

 **Example 2:** 

 **Input:**  customers = [1], grumpy = [0], minutes = 1

 **Output:**  1

 

 **Constraints:** 

- n == customers.length == grumpy.length
- 1 <= minutes <= n <= 2 * 104
- 0 <= customers[i] <= 1000
- grumpy[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-29T12:51:30.468Z  

```java
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int base = 0;

        // Customers who are already satisfied
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        int windowSum = 0;
        int maxWindow = 0;
        int left = 0;

        // Fixed-size sliding window
        for (int right = 0; right < customers.length; right++) {

            // Add newly included unsatisfied customers
            if (grumpy[right] == 1) {
                windowSum += customers[right];
            }

            // Keep window size <= minutes
            if (right - left + 1 > minutes) {

                if (grumpy[left] == 1) {
                    windowSum -= customers[left];
                }

                left++;
            }

            // Maximum customers we can recover
            maxWindow = Math.max(maxWindow, windowSum);
        }

        return base + maxWindow;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/grumpy-bookstore-owner/)