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