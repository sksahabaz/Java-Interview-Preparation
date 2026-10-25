# Smallest Repeating K Times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr**, the goal is to find out the smallest number that is repeated exactly ‘ **k** ’ times.

 **Note:**  If there is no such element then return  **-1**.

 **Example:** 

```
Input: arr[] = [2, 2, 1, 3, 1], k = 2
Output: 1
Explanation: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1.
```

```
Input: arr[] = [3, 5, 3, 2], k = 1
Output:  2 
Explanation: 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T17:01:06.207Z  

```java
class Solution {
    public int findDuplicate(int[] arr, int k) {
    

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        
      if(map.containsKey(arr[i])){
          
          map.put(arr[i],map.get(arr[i])+1);
      }else{
          map.put(arr[i],1);
      }    
        
    }
     
   
   
int smallest = Integer.MAX_VALUE;
   
   for( int nums : map.keySet()){
       if(map.get(nums) == k && nums < smallest){
           smallest = nums;
       }
   }
   
   return smallest ==  Integer.MAX_VALUE ? -1 : smallest;
}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1)