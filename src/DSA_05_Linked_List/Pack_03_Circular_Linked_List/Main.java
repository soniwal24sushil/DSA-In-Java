package DSA_05_Linked_List.Pack_03_Circular_Linked_List;

public class Main {

    public static void main(String[] args) {
        T_01_Custom_Circular_Linked_List list = new T_01_Custom_Circular_Linked_List();

        /* ********** INSERTION IN CIRCULAR LINKED LIST ********** */
        System.out.print("List after inserting at first position:- ");
        list.insertAtFirst(50);
        list.insertAtFirst(30);
        list.insertAtFirst(22);
        list.insertAtFirst(14);
        list.insertAtFirst(13);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at last position:- ");
        list.insertAtLast(3);
        list.insertAtLast(5);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at given position:- ");
        list.insert(92, 0);
        list.insert(82, 8);
        list.insert(72, 4);
        list.display();
        System.out.println("The size is:- " + list.size);

        /* ********** DELETION IN CIRCULAR LINKED LIST ********** */
        System.out.print("list after deleting the first node:- ");
        list.deleteFirst();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("list after deleting the last node:- ");
        list.deleteLast();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("list after deleting the desired node:- ");
        list.delete(3);
        list.display();
        System.out.println("The size is:- " + list.size);

    }
}
