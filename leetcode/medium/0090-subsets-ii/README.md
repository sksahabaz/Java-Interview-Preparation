# Subsets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` that may contain duplicates, return  *all possible*   *subsets** (the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.72%)  
**Memory:** 44.7 MB (beats 57.07%)  
**Submitted:** 2026-11-23T15:53:55.918Z  

```java
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(0,nums,new ArrayList<>(),result);
        return result;
    }

    public static void solve(int i,int[] nums,List<Integer> current,List<List<Integer>> result){

    if(i == nums.length){
        result.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[i]);
    solve(i+1,nums,current,result);
    current.remove(current.size()-1);

    int j = i+1;
    while(j<nums.length && nums[j] == nums[i]) j++;
    
        solve(j,nums,current,result);



    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subsets-ii/)