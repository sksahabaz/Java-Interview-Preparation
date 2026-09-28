# Find First Palindromic String in the Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings `words`, return  *the first  **palindromic**  string in the array*. If there is no such string, return  *an  **empty string*** `""`.

A string is  **palindromic**  if it reads the same forward and backward.

 

 **Example 1:** 

```
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

```

 **Example 2:** 

```
Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

```

 **Example 3:** 

```
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 100
- words[i] consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 47.6 MB (beats 27.60%)  
**Submitted:** 2026-09-28T14:35:30.905Z  

```java
class Solution {

public boolean isPalindrome(String s){
 
int i=0;
int j = s.length()-1;

while(i<j){
    if(s.charAt(i) != s.charAt(j)){
        return false;
    }
    i++;
    j--;
}
return true;
}
public String firstPalindrome(String[] words) {

 for(int i=0;i<words.length;i++){

   if(isPalindrome(words[i])){
    return words[i];
   }


 }
 
 return "";


   


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/)