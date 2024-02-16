package DSA_05_Linked_List.Pack_02_Doubly_Linked_List;

public class Main {

    public static void main(String[] args) {
        T_01_Custom_Doubly_Linked_List ll = new T_01_Custom_Doubly_Linked_List();

        /* ********* INSERTION IN DOUBLY LINKED LIST ********** */
        System.out.print("List after inserting at first position:- ");
        ll.insertAtFirst(50);
        ll.insertAtFirst(30);
        ll.insertAtFirst(22);
        ll.insertAtFirst(14);
        ll.insertAtFirst(13);
        ll.display();
        System.out.println("The size of list is:- " + ll.size);

        System.out.print("List after inserting at last position:- ");
        ll.insertAtLast(3);
        ll.insertAtLast(5);
        ll.display();
        System.out.println("The size is:- " + ll.size);

        System.out.print("List after inserting at given position:- ");
        ll.insertAtIndex(2, 2);
        ll.display();
        System.out.println("The size is:- " + ll.size);

        /* !********* DELETION IN SINGLY LINKED LIST ********** */
        System.out.print("list after deleting the first node:- ");
        ll.deleteFromFirst();
        ll.display();
        System.out.println("The size is:- " + ll.size);

        System.out.print("List after deleting the last node:- ");
        ll.deleteFromLast();
        ll.display();
        System.out.println("The size is:- " + ll.size);

        System.out.print("List after deleting the node of a given index:- ");
        ll.deleteFromIndex(2);
        ll.display();
        System.out.println("The size is:- " + ll.size);
    }
}
