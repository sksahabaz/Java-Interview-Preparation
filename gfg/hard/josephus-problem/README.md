# Josephus Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are playing a game with  **n**  people standing in a circle, numbered from  **1** to **n**. Starting from person 1, every  **kth**  person is eliminated in a circular fashion. The process continues until only one person remains.
Given integers n and k, return the position (1-based index) of the person who will survive.

 **Examples :** 

```
Input: n = 5, k = 2
Output: 3
Explanation: Firstly, the person at position 2 is killed, then the person at position 4 is killed, then the person at position 1 is killed. 
Finally, the person at position 5 is killed. So the person at position 3 survives. 
```

```
Input: n = 7, k = 3
Output: 4
Explanation: The elimination order is 3 → 6 → 2 → 7 → 5 → 1, and the person at position 4 survives.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T13:55:34.203Z  

```java
class Solution {
    public int josephus(int n, int k) {
        return solve(n, k) + 1;              
    }

    private int solve(int n, int k) {
        if (n == 1) return 0;               
        return (solve(n - 1, k) + k) % n;   
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/josephus-problem/1)