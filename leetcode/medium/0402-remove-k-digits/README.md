# Remove K Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given string num representing a non-negative integer `num`, and an integer `k`, return  *the smallest possible integer after removing*  `k`  *digits from*  `num`.

 

 **Example 1:** 

```
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

```

 **Example 2:** 

```
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

```

 **Example 3:** 

```
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

```

 

 **Constraints:** 

- 1 <= k <= num.length <= 105
- num consists of only digits.
- num does not have any leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 70.21%)  
**Memory:** 46.8 MB (beats 67.98%)  
**Submitted:** 2026-08-17T16:50:36.449Z  

```java
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        } 
    while(!st.isEmpty() && k>0){
        st.pop();
        k--;
    }
    StringBuilder sb = new StringBuilder();
    for(char ch : st){
        sb.append(ch);
    }

    int index = 0;
    //this will remove the trailling zeroes
    while(index < sb.length() && sb.charAt(index) == '0'){
        index++;
    }
   String ans = sb.substring(index);

   return ans.isEmpty() ?"0" : ans;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-k-digits/)