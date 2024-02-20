package DSA_06_Stack;

import java.util.ArrayList;

public class T_03_ArrayList_Implementation_of_Stack {

    static class ArrayListStack<T> {
        private ArrayList<T> stack;

        public ArrayListStack() {
            stack = new ArrayList<>();
        }

        public void push(T item) {
            stack.add(item); // Add item to the end of the ArrayList
        }

        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow! Cannot pop.");
                return null;
            }
            return stack.remove(stack.size() - 1); // Remove and return the last item
        }

        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot peek.");
                return null;
            }
            return stack.get(stack.size() - 1); // Return the last item
        }

        public boolean isEmpty() {
            return stack.isEmpty(); // Check if the ArrayList is empty
        }
    }

    public static void main(String[] args) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
