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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        // Initialize a dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; // Pointer for the current node
        int carry = 0; // Variable to store carry

        // Loop until both lists are fully traversed and carry is zero
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from the nodes; if null, use 0
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and update carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Carry for the next step
            int digit = sum % 10; // Single digit to store in the node

            // Add the digit to the result list
            current.next = new ListNode(digit);
            current = current.next; // Move to the next node

            // Move to the next nodes in l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Return the head of the result list
    }
}
