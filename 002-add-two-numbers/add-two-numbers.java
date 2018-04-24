// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
// Example
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        ListNode p = l1;
        ListNode q = l2;
        int a = 0;
        
        while (p != null || q != null) {
        
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + a;
            temp.next = new ListNode((x + y + a) % 10);
            a = (x + y + a) / 10;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
            temp = temp.next;
        }
        
        if (a != 0) {
            temp.next = new ListNode(a);
        }
        
        return ans.next;

    }
}
