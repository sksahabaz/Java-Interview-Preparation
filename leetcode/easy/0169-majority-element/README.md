# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 70.82%)  
**Memory:** 55.7 MB (beats 46.89%)  
**Submitted:** 2026-08-04T13:19:27.626Z  

```java
class Solution {
    public static int majorityElement(int[] nums) {
         
            int n = nums.length;
    int count =0;
    int element = 0;
    for(int i=0;i<n;i++){
        if(count == 0){
            element = nums[i];
            count =1;

        }else if(element == nums[i]){
            count++;
        }else{
            count--;
        }
    }
       
       
      int count1 =0;
      for(int i=0;i<n;i++){
        if(element == nums[i]){
            count1++;
        }
      }
      if(count1 > n/2){
        return element;
      }

      return -1;
    }
        public static void main(String args[]){
            int nums[]= {2,2,2,1,1,2,2,2};
          
        }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)