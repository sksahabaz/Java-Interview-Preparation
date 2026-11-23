# Subset Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **`arr`** of integers, return the sums of all subsets in the list.  Return the sums in any order.

**Examples:
**

```
Input: arr[] = [2, 3]
Output: [0, 2, 3, 5]
Explanation: When no elements are taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken then Sum = 3. When elements 2 and 3 are taken then Sum = 2+3 = 5.
```

```
Input: arr[] = [1, 2, 1]
Output: [0, 1, 1, 2, 2, 3, 3, 4]
Explanation: The possible subset sums are 0 (no elements), 1 (either of the 1's), 2 (the element 2), and their combinations.
```

```
Input: arr[] = [5, 6, 7]
Output: [0, 5, 6, 7, 11, 12, 13, 18]
Explanation: The possible subset sums are 0 (no elements), 5, 6, 7, and their combinations.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T15:24:00.452Z  

```java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
    
    
    
    ArrayList<Integer> result = new ArrayList<>();
    solve(0,0,arr,result);
        return result;
    }
  public static void solve(int i,int sum,int arr[],ArrayList<Integer> result){
      if(i == arr.length){
          result.add(sum);
          return;
      }
       solve(i+1,sum+arr[i],arr,result);
       solve(i+1,sum,arr,result);
      
      
  }
     
    
    
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subset-sums2234/1)