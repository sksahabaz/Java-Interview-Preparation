# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 67.53%)  
**Memory:** 94.2 MB (beats 89.68%)  
**Submitted:** 2026-09-18T10:24:38.057Z  

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
    public boolean isPalindrome(ListNode head) {

     ListNode fast = head;
     ListNode slow = head;
     while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
     }
         ListNode second = reverseMethod(slow);
         ListNode first = head;

         while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second  = second.next;
         }
       return  true;
    }
   public static ListNode reverseMethod(ListNode head){
   
    ListNode prev = null;
    ListNode curr = head;
    while(curr!=null){
    ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;

    }
   return prev;
   }

 





    
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)