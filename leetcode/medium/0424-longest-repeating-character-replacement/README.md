# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 89.00%)  
**Memory:** 46.3 MB (beats 50.72%)  
**Submitted:** 2026-09-04T14:28:28.022Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            frequency[index]++;

            maxFrequency = Math.max(maxFrequency, frequency[index]);

            while ((right - left + 1) - maxFrequency > k) {

                int leftIndex = s.charAt(left) - 'A';

                frequency[leftIndex]--;

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)