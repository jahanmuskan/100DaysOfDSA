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
        if (head == null || head.next == null) return true;  

        // Step 1: Find the middle of the linked list using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalfHead = reverseList(slow);

        // Step 3: Compare first half and reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfHead;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false; // Mismatch found
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // The list is a palindrome
    }

    // Helper method to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev; // New head of reversed list
    }
}