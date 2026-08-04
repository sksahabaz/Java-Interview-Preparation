# Two Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of integers `nums` and an integer `target`, return  *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have  ***exactly *one solution**, and you may not use the* same* element twice.

You can return the answer in any order.

 

 **Example 1:** 

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```

 **Example 2:** 

```
Input: nums = [3,2,4], target = 6
Output: [1,2]

```

 **Example 3:** 

```
Input: nums = [3,3], target = 6
Output: [0,1]

```

 

 **Constraints:** 

- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
- Only one valid answer exists.

 

 **Follow-up:** Can you come up with an algorithm that is less than `O(n2)` time complexity?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.32%)  
**Memory:** 47.4 MB (beats 11.16%)  
**Submitted:** 2026-08-04T11:50:03.197Z  

```java
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        HashMap<Integer,Integer>  mpp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(mpp.containsKey(complement)){
            return new int[] { mpp.get(complement), i };
            }else{
                mpp.put(nums[i],i);
            }
        }
       return new  int[] {-1,-1};
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/two-sum/)