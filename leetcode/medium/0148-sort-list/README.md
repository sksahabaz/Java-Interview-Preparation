# Sort List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, return  *the list after sorting it in  **ascending order***.

 

 **Example 1:** 

```
Input: head = [4,2,1,3]
Output: [1,2,3,4]

```

 **Example 2:** 

```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 5 * 104].
- -105 <= Node.val <= 105

 

 **Follow up:**  Can you sort the linked list in `O(n logn)` time and `O(1)` memory (i.e. constant space)?

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 15.18%)  
**Memory:** 62.8 MB (beats 18.85%)  
**Submitted:** 2026-07-27T13:22:15.998Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

   ArrayList<Integer>  arr =   new ArrayList<>();
          
     ListNode temp = head;

     while(temp != null){
      arr.add(temp.val);
      temp = temp.next;
     }   
     Collections.sort(arr);
     temp = head;
     for(int i=0;i<arr.size();i++){
        temp.val = arr.get(i);
        temp = temp.next;
     }
     return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-list/)