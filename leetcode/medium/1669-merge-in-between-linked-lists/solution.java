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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
          // Dummy node handles the case where a = 0
        ListNode dummy = new ListNode(0);
        dummy.next = list1;

        // Find node before index a
        ListNode beforeA = dummy;

        for (int i = 0; i < a; i++) {
            beforeA = beforeA.next;
        }

        // Find node after index b
        ListNode afterB = beforeA.next;

        for (int i = a; i <= b; i++) {
            afterB = afterB.next;
        }

        // Find tail of list2
        ListNode tail2 = list2;

        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        // Connect beforeA → list2
        beforeA.next = list2;

        // Connect list2 → afterB
        tail2.next = afterB;

        return dummy.next;
    }
}