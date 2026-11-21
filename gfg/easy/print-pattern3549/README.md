# Decreasing Increasing Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, generate a sequence following these rules:

- Start with `n` and repeatedly subtract 5 until the number becomes less than or equal to 0.
- Then, repeatedly add 5 until the sequence reaches the original number `n`.

Solve the problem without using loops.

 **Examples:** 

```
Input: n = -16
Output: [-16]
Explanation: Since -16 is less than or equal to 0, no subtraction occurs and the sequence terminates immediately with [-16].
```

```
Input: n = 10
Output: [10, 5, 0, 5, 10]
Explanation: The value decreases by 5 until it reaches 0:10 -> 5 -> 0. Then, 5 is repeatedly added until it returns to 10: 0 -> 5 -> 10.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:40:51.889Z  

```java
class Solution {
    public ArrayList<Integer> pattern(int n) {
      
      ArrayList<Integer> list = new ArrayList<>();
      
      solve(n,list);
      return list;
        
    }
    
    public static void solve(int n, ArrayList<Integer> list){
        
    list.add(n);
    if(n<=0){
        return;
    }
    
    solve(n-5,list);
    list.add(n);
        
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-pattern3549/1)