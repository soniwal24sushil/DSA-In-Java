package DSA_05_Linked_List.Pack_02_Doubly_Linked_List;

public class T_01_Custom_Doubly_Linked_List {
    public Node head;
    public int size;

    public T_01_Custom_Doubly_Linked_List() {
        this.size = 0;
    }

    /* ********** INSERTION IN SINGLY LINKED LIST ********** */

    // ? (1) Insert At First Position.
    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    // ? (2) Insert At Last Position.
    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
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

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        node.prev = temp;
        size++;
    }

    /* ********** DELETION IN SINGLY LINKED LIST ********** */

    // ? (1) Delete First Node.
    public void deleteFromFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    // ? (2) Delete Last Node.
    public void deleteFromLast() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        if (head.next == null) {
            deleteFromFirst();
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
        temp.next.prev = temp;
        size--;
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

    /* ********* Node Structure of a Doubly Linked List ********** */
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
