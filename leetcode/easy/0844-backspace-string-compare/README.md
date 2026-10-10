# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 60.83%)  
**Memory:** 43.5 MB (beats 15.07%)  
**Submitted:** 2026-10-10T14:38:14.872Z  

```java
class Solution {
    public boolean backspaceCompare(String s, String t) {

   Stack<Character> a = new Stack<>();
   Stack<Character> b = new Stack<>();

  for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    if(ch == '#' ){
     if (!a.isEmpty()) a.pop();
    }else{
        a.push(ch);
    }
  }


for(int i=0;i<t.length();i++){
    char ch = t.charAt(i);
    if(ch == '#'){
 if (!b.isEmpty()) b.pop();
    }else{
        b.push(ch);
    }
  }
   
   return a.equals(b);


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)