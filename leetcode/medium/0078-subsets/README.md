# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 91.82%)  
**Memory:** 43.7 MB (beats 75.11%)  
**Submitted:** 2026-11-11T17:35:43.975Z  

```java
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> current = new ArrayList<>();
     backtrack(0,nums,result,current);
      return result;
    }

     private void backtrack(int index,
     int nums[],  List<List<Integer>> result,List<Integer> current){


      if( index == nums.length){
        result.add(new ArrayList<>(current));
        return;
      }
    
    current.add(nums[index]);

    backtrack(index+1,nums,result,current);

    current.remove(current.size()-1);


     backtrack(index+1,nums,result,current);




     }


    
}
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)