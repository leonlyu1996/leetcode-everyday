//
// Given a linked list, determine if it has a cycle in it.
//
//
//
// Follow up:
// Can you solve it without using extra space?
//


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
    public boolean hasCycle(ListNode head) {
        
        if (head == null) {
            return false;
        }
        
        ListNode one_step = head;
        ListNode two_step = head.next;
       
        while (one_step != null && two_step != null) {
            if (one_step == two_step) {
                return true;
            }
            one_step = (one_step == null) ? null : one_step.next;
            two_step = (two_step == null) ? null : two_step.next;
            two_step = (two_step == null) ? null : two_step.next;
        }
        
        return false;
        
    }
}
