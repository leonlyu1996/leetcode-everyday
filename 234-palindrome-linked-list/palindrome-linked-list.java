// Given a singly linked list, determine if it is a palindrome.
//
// Example 1:
//
//
// Input: 1->2
// Output: false
//
// Example 2:
//
//
// Input: 1->2->2->1
// Output: true
//
// Follow up:
// Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }    
        
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode preNode = null;
        while (head != null) {
            ListNode thisNode = new ListNode(head.val);
            thisNode.next = preNode;
            preNode = thisNode;
            head = head.next;
        }
        
        return preNode;
    }
}
