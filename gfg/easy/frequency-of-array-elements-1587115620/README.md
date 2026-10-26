# Frequencies in a Limited Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number **i**  (1-based indexing).

 **Examples:** 

```
Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
```

```
Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
```

```
Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T17:35:49.440Z  

```java
class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=1;i<=n;i++){
            map.put(i,0);
        }
        
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for( int value: map.values()){
            al.add(value);
        }
        
        return al;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1)