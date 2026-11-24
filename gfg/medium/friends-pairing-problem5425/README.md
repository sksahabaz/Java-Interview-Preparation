# Friends Pairing Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given  **n** friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

 **Examples :** 

```
Input: n = 3
Output: 4
Explanation:
{1}, {2}, {3} : All single
{1}, {2,3} : 2 and 3 paired but 1 is single.
{1,2}, {3} : 1 and 2 are paired but 3 is single.
{1,3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1,2} and {2,1} are considered same.

```

```
Input: n = 2
Output: 2
Explanation:
{1} & {2}: All single.
{1,2}: 1 and 2 are paired.

```

```
Input: n = 1
Output: 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T12:13:23.237Z  

```java
class Solution {
    public int countFriendsPairings(int n) {
     
     if(n <= 2){
         return n;
     }
     int single = countFriendsPairings(n-1);
     int paired = (n-1) * countFriendsPairings(n-2);
     
     return single + paired;
     
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1)