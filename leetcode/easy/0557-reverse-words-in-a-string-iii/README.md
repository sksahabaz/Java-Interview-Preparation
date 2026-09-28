# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 99.46%)  
**Memory:** 46.5 MB (beats 72.15%)  
**Submitted:** 2026-09-28T14:48:43.392Z  

```java
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int start = 0;

        while (start < chars.length) {

            int end = start;

            // Find the end of the current word
            while (end < chars.length && chars[end] != ' ') {
                end++;
            }

            // Reverse current word
            int left = start;
            int right = end - 1;

            while (left < right) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            // Move to next word
            start = end + 1;
        }

        return new String(chars);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)