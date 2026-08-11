# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 86.07%)  
**Memory:** 43.4 MB (beats 41.35%)  
**Submitted:** 2026-08-11T07:42:30.641Z  

```java
class Solution {
    public boolean isValid(String s) {
         
          Stack<Character>  stack = new Stack<>();
          
          for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
             
           if(ch == '(' || ch == '{' || ch == '['){
            stack.push(ch);
           }
            else if( ch == ')' || ch == '}' || ch == ']'){

                 if(stack.isEmpty()){
                    return false;
                 }
                char top = stack.pop();
                if(ch == ')' && top!= '('  
                 || ch == ']' && top!='['
                || ch == '}'  && top!= '{'){
                    
                    return false;
                }

            }
       

          }
          return stack.isEmpty();



    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)