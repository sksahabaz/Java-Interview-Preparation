# Non-Crossing Handshakes in Circle

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

There are  **n**  people sitting around a circular table. Any two people can shake hands with each other. Find the number of ways to perform handshakes such that no two handshakes intersect or cross each other when the handshakes are represented as straight lines between the corresponding people.

A handshake is considered crossing if the line segments representing two handshakes intersect at a point other than a common endpoint.

 **Examples:** 

```
Input: n = 4
Output: 2
Explanation: The two possible non-crossing handshake arrangements are: {{1, 2}, {3, 4}} and {{1, 4}, {2, 3}}.

```

```
Input: n = 2
Output: 1
Explanation: The only possible handshake is {1, 2}.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T13:51:16.365Z  

```java
class Solution {
    int[] memo = new int[31];                       

    public int count(int n) {
        if (n == 0) return 1;                      
        if (memo[n] != 0) return memo[n];         
        int total = 0;
        for (int i = 0; i <= n - 2; i += 2) {      
            total += count(i) * count(n - 2 - i);   
        }
        return memo[n] = total;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/handshakes1303/1)