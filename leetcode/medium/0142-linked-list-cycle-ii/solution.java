/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        LinkedHashMap<ListNode,Integer> map = new LinkedHashMap<>();
        ListNode temp = head;

        while(temp != null){
            if(map.containsKey(temp)){
              return temp;
            }else{
                map.put(temp,1);
            }
            temp = temp.next;
        }
        return null;
    }
}