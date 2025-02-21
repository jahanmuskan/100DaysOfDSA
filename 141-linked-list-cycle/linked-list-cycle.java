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
        ListNode fast = head;  // fast pointer on head
        ListNode slow = head;  // slow pointer on head
        while(fast != null && fast.next != null){  // condition to check for both even/odd list
            fast = fast.next.next; // move fast pointer by 2x speed
            slow = slow.next; // move slow pointer by 1x speed
            if(fast == slow){  // condition when a LinkedList is cyclic
                return true; // LinkedList is cyclic
            }
        }
        return false; // LinkedLust is not cyclic
    }
}