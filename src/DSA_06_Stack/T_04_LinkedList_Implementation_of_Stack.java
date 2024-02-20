package DSA_06_Stack;

import java.util.LinkedList;

public class T_04_LinkedList_Implementation_of_Stack {

    static class LinkedListStack<T> {
        private LinkedList<T> stack;

        public LinkedListStack() {
            stack = new LinkedList<>();
        }

        public void push(T item) {
            stack.addFirst(item); // Add item to the beginning of the LinkedList
        }

        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow! Cannot pop.");
                return null;
            }
            return stack.removeFirst(); // Remove and return the first item
        }

        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot peek.");
                return null;
            }
            return stack.getFirst(); // Return the first item
        }

        public boolean isEmpty() {
            return stack.isEmpty(); // Check if the LinkedList is empty
        }
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
