# Array Subset

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **a[]** and  **b[]**, your task is to determine whether  **b[]**  is a subset of  **a[]**.

 **Examples:** 

```
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T16:50:43.105Z  

```java

class Solution {
    public boolean isSubset(int a[], int b[]) {
       
       
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int nums : a ){
           map.put(nums,map.getOrDefault(nums,0)+1);
       }
       
           for(int nums : b){
               if(map.containsKey(nums) && map.get(nums)>0){
                   map.put(nums,map.get(nums)-1);
               }else{
                   return false;
               }
           }
       return true;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)