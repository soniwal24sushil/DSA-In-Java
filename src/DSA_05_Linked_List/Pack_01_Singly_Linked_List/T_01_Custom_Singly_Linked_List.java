package DSA_05_Linked_List.Pack_01_Singly_Linked_List;

public class T_01_Custom_Singly_Linked_List {
    public Node head;
    public int size;

    public T_01_Custom_Singly_Linked_List() {
        this.size = 0;
    }

    /* ********** INSERTION IN SINGLY LINKED LIST ********** */

    // ? (1) Insert At First Position.
    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    // ? (2) Insert At Last Position.
    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertAtFirst(data);
            return;
        }

        // ! Find the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        size++;
    }

    // ? (3) Insert At A Target Index.
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }

        // ! Reach the index-1 position
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    /* ********** DELETION IN SINGLY LINKED LIST ********** */

    // ? (1) Delete First Node.
    public void deleteFromFirst() {
        // ! If list is empty.
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    // ? (2) Delete Last Node.
    public void deleteFromLast() {
        // ! If list is empty.
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // ! If list has only one node.
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // ? (3) Delete the node of a target index.
    public void deleteFromIndex(int index) {
        if (index == 0) {
            deleteFromFirst();
            return;
        }
        if (index == size) {
            deleteFromLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    /* ********* FIND THE TARGET NODE ********** */
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Not Found
    }

    /* ********* Method To Display Singly Linked List ********** */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    /* ********* Node Structure of a Singly Linked List ********** */
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}


