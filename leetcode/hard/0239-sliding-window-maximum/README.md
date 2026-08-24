# Sliding Window Maximum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of integers `nums`, there is a sliding window of size `k` which is moving from the very left of the array to the very right. You can only see the `k` numbers in the window. Each time the sliding window moves right by one position.

Return  *the max sliding window*.

 

 **Example 1:** 

```
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

```

 **Example 2:** 

```
Input: nums = [1], k = 1
Output: [1]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 42.73%)  
**Memory:** 143.6 MB (beats 77.29%)  
**Submitted:** 2026-08-24T10:49:48.694Z  

```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    int n = nums.length;
    int [] result = new int[n-k+1];
                   
    Deque<Integer> deque  = new ArrayDeque<>();

    int resultIndex = 0;
     for(int i=0;i<n;i++){
 while(!deque.isEmpty() && deque.peekFirst() < i-k+1){
    deque.removeFirst();
 }
while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
    deque.removeLast();
}
 deque.addLast(i);
if( i>=k-1){
    result[resultIndex] =nums[deque.peekFirst()];
    resultIndex++;
}

    }    
  
   return result;



    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sliding-window-maximum/)