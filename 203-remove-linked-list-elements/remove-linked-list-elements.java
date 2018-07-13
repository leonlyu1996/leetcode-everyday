// Remove all elements from a linked list of integers that have value val.
//
// Example:
//
//
// Input:  1->2->6->3->4->5->6, val = 6
// Output: 1->2->3->4->5
//
//


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        if (head == null) {
            return null;
        }
        
        ListNode newHead = new ListNode(head.val);
        ListNode ptr = newHead;
        
        while (head.next != null) {
            head = head.next;
            if (head != null && head.val != val) {
                ptr.next = new ListNode(head.val);
                ptr = ptr.next;
            }
        }
        
        return newHead;
        
    }
}
