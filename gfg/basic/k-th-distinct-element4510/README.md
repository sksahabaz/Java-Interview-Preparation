# K-th Distinct in Order of Appearance

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, find the k-th distinct element in the array. A distinct element that appears exactly once in the entire array.  Distinct elements are considered in the same order as they appear in the array.

Return the  **k-th**  distinct element if it exists; otherwise, return  **-1**.

 **Examples:** 

```
Input: arr[] = [1, 2, 1, 3, 4, 2], k = 2
Output: 4
Explanation: The elements that appear exactly once are 3 and 4. In their order of appearance, the 2nd distinct element is 4.

```

```
Input: arr[] = [5, 1, 2, 5, 3, 2, 4], k = 3
Output: 4
Explanation: The elements that appear exactly once are 1, 3, and 4. The 3rd distinct element is 4.

```

 **Constraints:** 
1 ≤ n ≤ 105, where n is the length of the array
1 ≤ arr[i] ≤ 106
1 ≤ k ≤ n

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T17:37:29.663Z  

```java
class Solution {
    public int kthDistinct(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                k--;

                if (k == 0) {
                    return num;
                }
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/k-th-distinct-element4510/1)