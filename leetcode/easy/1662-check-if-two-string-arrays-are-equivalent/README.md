# Check If Two String Arrays are Equivalent

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two string arrays `word1` and `word2`, return `true` *if the two arrays  **represent**  the same string, and* `false` *otherwise.* 

A string is  **represented**  by an array if the array elements concatenated  **in order**  forms the string.

 

 **Example 1:** 

```
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
```

 **Example 2:** 

```
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

```

 **Example 3:** 

```
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

```

 

 **Constraints:** 

- 1 <= word1.length, word2.length <= 103
- 1 <= word1[i].length, word2[i].length <= 103
- 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
- word1[i] and word2[i] consist of lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 16.50%)  
**Memory:** 42.4 MB (beats 99.10%)  
**Submitted:** 2026-10-22T17:18:14.582Z  

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    String s = "";

   for(int i=0;i<word1.length;i++){
   
    s+= word1[i];

   }
    
   String t = "" ;
  for(int i=0;i<word2.length;i++){
    t+=word2[i];
  }
  
  return s.equals(t);






    }
}


// what i am thinking is i need to concatend the word1 and word2 
// then after that i need to check whether they are equal or not
//if equal then i need to return true if not then i return false;
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)