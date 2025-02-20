package DSA.Day9;

public class BasicOperationsOfLinkedList {
    Node head;

    // Creating Node
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Add Node at First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Node at Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Print all Nodes
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data+ "--> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    // Delete Node from First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // Delete Node from Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        // Edge case when we have only one node
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Main method to test linked list operations
    public static void main(String[] args) {
        BasicOperationsOfLinkedList list = new BasicOperationsOfLinkedList();

        // Adding nodes at the beginning
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        System.out.println("List after adding nodes at the beginning:");
        list.printList();

        // Adding nodes at the end
        list.addLast("D");
        list.addLast("E");
        System.out.println("List after adding nodes at the end:");
        list.printList();

        // Deleting first node
        list.deleteFirst();
        System.out.println("List after deleting first node:");
        list.printList();

        // Deleting last node
        list.deleteLast();
        System.out.println("List after deleting last node:");
        list.printList();
    }
}
