package DSA.Day9;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move prev forward
            current = nextNode; // Move current forward
        }

        return prev; // New head of the reversed list
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}
