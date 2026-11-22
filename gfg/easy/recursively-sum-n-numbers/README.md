# Recursively Sum n Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, recursively sum the numbers from 1 to n and return the sum.

 **Examples:** 

```
Input: n = 5
Output: 15
Explanation: Sum from 1 to 5 is 1 + 2 + 3 + 4 + 5 = 15.
```

```
Input: n = 4
Output: 10
Explanation: Sum from 1 to 4 is 1 + 2 + 3 + 4 = 10.
```

 **Constraints:** 
0 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T12:58:19.753Z  

```java
class Solution {
	public int recursiveSum(int n) {
		
		if (n == 0) {
			
			return 0;
		}
		
		return n + recursiveSum(n - 1);
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/recursively-sum-n-numbers/1)