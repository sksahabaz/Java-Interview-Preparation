# Tower Of Hanoi

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given  **n**  disks, consider three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).  Initially disks are  placed on the starting rod. The smallest disk is placed on top and the largest at the bottom.

Calculate the minimum number of **moves**  required to transfer all  **n**  disks from the starting rod to the target rod, following these rules:

- Only one disk can be moved at a time.
- A disk can only be placed on top of a larger disk or on an empty rod.

Find the minimum number of moves needed to complete the task.

 **Examples:** 

```
Input: n = 2
Output: 3
Explanation: For n = 2, total 3 steps will be taken. Steps are as follows -
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3

```

```
Input: n = 3
Output: 7
Explanation: For n = 3, total 7 steps will be taken.Steps are as follows -
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3

```

```
Input: n = 0
Output: 0
Explanation: Total 0 steps will be taken.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T13:44:11.139Z  

```java
class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
    
     if(n==0) return 0;
     
     int a = towerOfHanoi(n-1,from,aux,to);
     int b = towerOfHanoi(n-1,aux,to,from);
     
     return a+b+1;
      
    
    
        
    }
    
    
   void hanoi(int n, int from, int to, int aux) {
       if (n == 0) return;
       hanoi(n - 1, from, aux, to);
       System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
       hanoi(n - 1, aux, to, from);
   }
        
    
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1)