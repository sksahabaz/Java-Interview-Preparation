# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

Original
Java
 **Example 1:** 

```
Input:int n = 3;Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input:int n = 1;Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 85.68%)  
**Memory:** 43.5 MB (beats 99.63%)  
**Submitted:** 2026-11-11T16:42:17.015Z  

```java
class Solution {
    public List<String> generateParenthesis(int n) {
         
     List<String> result = new ArrayList<>();
     StringBuilder current = new StringBuilder();
     backtrack(result,current,0,0,n);

     return result;
    }
 
  private void backtrack(List<String> result
  ,StringBuilder current,int open,int close,int n){


    if(current.length() == 2*n){
        result.add(current.toString());
        return;
    }
 
    //choice-1
    if(open < n){

   current.append("(");
   backtrack(result,current,open+1,close,n);
    
    current.deleteCharAt(current.length()-1);
   
    }

   //choice 2

   if(close < open){
 

   current.append(")");
   backtrack(result,current,open,close+1,n);

   current.deleteCharAt(current.length()-1);

   }


  }
 


}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)