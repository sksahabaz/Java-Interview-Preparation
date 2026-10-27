# Second Largest

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of positive integers  **arr[]**, return the second largest element from the array. If the second largest element doesn't exist then return  **-1.** 

Note: The second largest element should not be equal to the largest element.

 **Examples:** 

```
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
```

```
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
```

```
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T05:13:02.068Z  

```java
class Solution {
    public int getSecondLargest(int[] arr) {
      

    int largest = -1;
    int secondlargest = -1;
    
    for(int i=0;i<arr.length;i++){
        
    if(arr[i]>largest){
        
        secondlargest = largest;
        largest = arr[i];
    }else if(arr[i] < largest && arr[i]>secondlargest){
        secondlargest = arr[i];
    }    
        
    }
    
    return secondlargest;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-largest3735/1)