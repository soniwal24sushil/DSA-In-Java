package DSA_05_Linked_List.Pack_03_Circular_Linked_List;

public class T_01_Custom_Circular_Linked_List {
    public Node head;
    public int size;

    public T_01_Custom_Circular_Linked_List() {
        this.size = 0;
    }

    /* ********** INSERTION IN CIRCULAR LINKED LIST ********** */

    // ? (1):- Insert At First.
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            node.next = head;
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            head = node;
        }
        size++;
    }

    // ? (2):- Insert At Last.
    public void insertAtLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
        }
        size++;
    }

    // ? (3):- Insert At A Given Position.
    public void insert(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        } else {
            Node node = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    /* ********** DELETION IN CIRCULAR LINKED LIST ********** */

    // ? (1) Delete First Node.
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = head.next;
            head = head.next;
        }
        size--;
    }

    // ? (2) Delete Last Node.
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        } else {
            Node temp = head;
            while (temp.next.next != head)
                temp = temp.next;
            temp.next = head;
        }
        size--;
    }

    // (3) Delete Node Of A Given Index.
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Method To Display Circular Linked List.
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("Head");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
