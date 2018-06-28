// Given a sorted linked list, delete all duplicates such that each element appear only once.
//
// Example 1:
//
//
// Input: 1->1->2
// Output: 1->2
//
//
// Example 2:
//
//
// Input: 1->1->2->3->3
// Output: 1->2->3
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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null) {
            return null;
        }
        
        ListNode h = head;
        
        while (head.next != null) {
            ListNode nextNode = head.next;
            if (head.val == nextNode.val) {
                head.next = nextNode.next;
            } else {
                head = head.next;
            }
        }
        
        return h;
        
        
    }
}
