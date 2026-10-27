# second-largest3735

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T05:01:20.202Z  

```java
class Solution {
    public int getSecondLargest(int[] arr) {
      
      Arrays.sort(arr);
      
      for(int i=arr.length-2;i>=0;i--){
          if(arr[i] != arr[arr.length-1]){
              return arr[i];
          }
      }
      
      return -1;
      
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-largest3735/1)