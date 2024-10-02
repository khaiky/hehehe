public class linkedlist {
    private Node head; 

    // Node class
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If the head needs to be removed
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; 
                return;
            }
            current = current.next;
        }
    }
    
    // Method to move a node to a new position /swap nodes
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) return;
        
        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;

        // Find the node to move
        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingNode = current;

        // If the node to move was not found
        if (movingNode == null) return;

        // Remove the node from its current position
        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            // Moving the head
            head = movingNode.next; 
        }

        // Insert the node at the new position
        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev == null) {
            movingNode.next = head;
            head = movingNode;
        } else {
            movingNode.next = current;
            prev.next = movingNode;
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printList(); // prints: 1 -> 2 -> 3 -> 4 -> 5 -> null

        list.moveNodePointer(2, 0);
        list.printList(); // prints: 3 -> 1 -> 2 -> 4 -> 5 -> null
    }
}
