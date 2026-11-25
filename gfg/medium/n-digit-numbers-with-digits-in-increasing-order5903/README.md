# N-Digit Numbers with Increasing Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer  **n**, return all the  **n**  digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).

 **Examples :** 

```
Input: n = 1
Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Explanation: Single digit numbers are considered to be strictly increasing order.

```

```
Input: n = 2
Output: [12, 13, 14, 15, 16, 17, 18, 19, 23....79, 89]
Explanation: For n = 2, the correct sequence is 12 13 14 15 16 17 18 19 23 and so on up to 89.
```

```
Input: n = 15
Output: []
Explanation: No such number exist. 
```

 **Constraints:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T13:42:29.102Z  

```java
class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) {                         
            for (int d = 0; d <= 9; d++) res.add(d);
            return res;
        }
        if (n > 9) return res;               
        solve(0, 0, n, res);
        return res;
    }

    static void solve(int num, int last, int left, ArrayList<Integer> res) {
        if (left == 0) {                    
            res.add(num);
            return;
        }
        for (int d = last + 1; d <= 9; d++) { 
            solve(num * 10 + d, d, left - 1, res);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1)