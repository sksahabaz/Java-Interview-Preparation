# First n Fibonacci using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, return an array containing the first n Fibonacci numbers.

- The first two Fibonacci numbers are 0 and 1. 
- Each subsequent Fibonacci number is obtained by adding the previous two numbers.

 **Examples:** 

```
Input: n = 5
Output: [0, 1, 1, 2, 3]
Explanation: The first 5 Fibonacci numbers are 0, 1, 1, 2, 3.

```

```
Input: n = 7
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The first 7 Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8.
```

```
Input: n = 2
Output: [0, 1]
Explanation: The first 2 Fibonacci numbers are 0 and 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T12:30:53.891Z  

```java
class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
    
    //   step:1 base case
    if(n==1){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        return list;
    }
    
    if(n==2){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return list;
    }
    
    ArrayList<Integer> list = fibonacciNumbers(n-1);
    
    int size = list.size();
    
    list.add(list.get(size-1) + list.get(size-2));
    
    return list;
    
    
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1)