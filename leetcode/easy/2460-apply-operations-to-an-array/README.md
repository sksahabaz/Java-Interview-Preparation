# Apply Operations to an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  array `nums` of size `n` consisting of  **non-negative**  integers.

You need to apply `n - 1` operations to this array where, in the `ith` operation (**0-indexed**), you will apply the following on the `ith` element of `nums`:

- If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.

After performing  **all**  the operations,  **shift**  all the `0`'s to the  **end**  of the array.

- For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].

Return  *the resulting array*.

 **Note**  that the operations are applied  **sequentially**, not all at once.

 

 **Example 1:** 

```
Input: nums = [1,2,2,1,1,0]
Output: [1,4,2,0,0,0]
Explanation: We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].

```

 **Example 2:** 

```
Input: nums = [0,1]
Output: [1,0]
Explanation: No operation can be applied, we just shift the 0 to the end.

```

 

 **Constraints:** 

- 2 <= nums.length <= 2000
- 0 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.51%)  
**Memory:** 44.6 MB (beats 95.93%)  
**Submitted:** 2026-10-22T18:03:04.664Z  

```java

class Solution {

    public static int[] applyOperations(int[] nums) {

        int i = 0;
        int j = 1;

        // Step 1: Apply operations
        while (j < nums.length) {

            if (nums[i] == nums[j]) {
                nums[i] = nums[i] * 2;
                nums[j] = 0;
            }

            i++;
            j++;
        }

        // Step 2: Move zeroes to the end
        return moveszerosToend(nums);
    }

    public static int[] moveszerosToend(int[] nums) {

        int i = 0;
        int j = 1;

        while (j < nums.length) {

            if (nums[i] == 0 && nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;

            } else if (nums[i] != 0) {
                i++;
                j++;

            } else {
                j++;
            }
        }

        return nums;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/apply-operations-to-an-array/)