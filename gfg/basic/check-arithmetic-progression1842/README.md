# Check Arithmetic Progression

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of integers. Write a program to check whether an arithmetic progression can be formed using all the given elements. 

 **Examples:** 

```
Input: arr[] = [0, 12, 4, 8]
Output: true
Explanation: Rearrange given array as [0, 4, 8, 12] which forms an arithmetic progression.
```

```
Input: arr[] = [12, 40, 11, 20]
Output: false
Explanation: there is no rearrangment which can forms an arithmetic progression.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T16:55:34.644Z  

```java
class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
      
      Arrays.sort(arr);
        
       int i =0;
       int j=i+1;
       int diff = arr[j] - arr[i];   
       while(j<arr.length-1){
           
        i++;
        j++;
        if(arr[j] - arr[i] != diff){
            return false;
        }
           
       }
  
      
      return true;
      
    }
}

// diff =  arr[i] - arr[i-1]
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-arithmetic-progression1842/1)