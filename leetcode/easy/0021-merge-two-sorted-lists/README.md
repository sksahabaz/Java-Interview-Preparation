# Merge Two Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one  **sorted**  list. The list should be made by splicing together the nodes of the first two lists.

Return  *the head of the merged linked list*.

 

 **Example 1:** 

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

```

 **Example 2:** 

```
Input: list1 = [], list2 = []
Output: []

```

 **Example 3:** 

```
Input: list1 = [], list2 = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 74.58%)  
**Submitted:** 2026-09-18T10:02:05.805Z  

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   ListNode dummy = new ListNode(0);
ListNode curr = dummy;

while (list1 != null && list2 != null) {

    if (list1.val <= list2.val) {
        curr.next = list1;
        list1 = list1.next;
    } else {
        curr.next = list2;
        list2 = list2.next;
    }

    curr = curr.next;
}

curr.next = (list1 != null) ? list1 : list2;

return dummy.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)