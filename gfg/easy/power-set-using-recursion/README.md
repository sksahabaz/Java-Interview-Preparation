# Power Set

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string. You need to return the power set (in any order) of the string.

 **Examples:** 

```
Input: s = a
Output: ["","a"]
Explanation: empty string and "a" are only sets.
```

```
Input: s = abc
Output: ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Explanation: empty string, a, ab, abc, ac, b, bc, c are the sets.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T12:25:24.771Z  

```java
class Solution {
	public ArrayList<String> powerSet(String s) {
		
		ArrayList<String> result = new ArrayList<>();
		solve(0, "",s,result);
		return result;
	}
	
	public static void solve(int i,String current,String s,ArrayList<String> result){
	    
	    if(i == s.length() ){
	        result.add(current);
	        return;
	    }
	    
	    solve(i+1,current+s.charAt(i),s,result);
	    solve(i+1,current,s,result);
	    
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-set-using-recursion/1)