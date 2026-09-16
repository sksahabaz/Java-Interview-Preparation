# Validate Stack Sequences

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integer arrays `pushed` and `popped` each with distinct values, return `true` *if this could have been the result of a sequence of push and pop operations on an initially empty stack, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

```

 **Example 2:** 

```
Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.

```

 

 **Constraints:** 

- 1 <= pushed.length <= 1000
- 0 <= pushed[i] <= 1000
- All the elements of pushed are unique.
- popped.length == pushed.length
- popped is a permutation of pushed.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 89.02%)  
**Memory:** 46.3 MB (beats 63.54%)  
**Submitted:** 2026-09-16T09:47:38.087Z  

```java
import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();
        int j = 0;

        for (int value : pushed) {
            st.push(value);

            while (!st.isEmpty() && j < popped.length
                    && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/validate-stack-sequences/)