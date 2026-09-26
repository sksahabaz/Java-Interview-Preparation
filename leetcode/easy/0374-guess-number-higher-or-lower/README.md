# Guess Number Higher or Lower

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

- -1: Your guess is higher than the number I picked (i.e. num > pick).
- 1: Your guess is lower than the number I picked (i.e. num < pick).
- 0: your guess is equal to the number I picked (i.e. num == pick).

Return  *the number that I picked*.

 

 **Example 1:** 

```
Input: n = 10, pick = 6
Output: 6

```

 **Example 2:** 

```
Input: n = 1, pick = 1
Output: 1

```

 **Example 3:** 

```
Input: n = 2, pick = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1
- 1 <= pick <= n

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 53.78%)  
**Submitted:** 2026-09-26T14:27:54.698Z  

```java
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
         int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/guess-number-higher-or-lower/)