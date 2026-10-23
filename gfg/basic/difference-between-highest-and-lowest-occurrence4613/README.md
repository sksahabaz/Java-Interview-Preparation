# Highest and Lowest Frequencies

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array, the task is to find the difference between the highest occurrence and lowest occurrence of any numbers in an array. If only one type of element is present in the array return 0

 **Examples:** 

```
Input: arr[] = [1, 2, 2]
Output: 1
Explanation:  Lowest occurring element (1) occurs once. Highest occurring element (2) occurs 2 times
```

```
Input: arr[] = [7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5]
Output: 2
Explanation : Lowest occurring element (2) occurs once. Highest occurring element (7) occurs 3 times
```

 **Constraints:** 
1<= arr.size() <=106
1<= arr[i] <=106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T17:54:15.525Z  

```java
class Solution {
    public int findDiff(int[] arr) {
        
        if(arr.length == 1){
            return 0;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int nums : arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
      
      
      int highest = Integer.MIN_VALUE;
      int lowest = Integer.MAX_VALUE;
      
      for(Map.Entry<Integer, Integer> entry   : map.entrySet() ){
          
          if(entry.getValue() > highest){
              highest = entry.getValue();
          } if(entry.getValue() < lowest){
              lowest = entry.getValue();
          }
          
          
          
      }
      return highest - lowest;
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1)