package DSA_06_Stack;

import java.util.Scanner;

public class T_02_Array_Implementation_of_Stack {

    static class ArrayStack {
        private final int[] stackArray;
        private final int maxSize;
        private int top;

        public ArrayStack(int maxSize) {
            this.maxSize = maxSize;
            stackArray = new int[maxSize];
            top = -1; // Initialize top as -1 to indicate an empty stack
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value; // Increment top and insert value
            } else {
                System.out.println("Stack overflow! Cannot push " + value);
            }
        }

        public int pop() {
            if (top >= 0) {
                return stackArray[top--]; // Return top element and decrement top
            } else {
                System.out.println("Stack underflow! Cannot pop.");
                return -1;
            }
        }

        public int peek() {
            if (top >= 0) {
                return stackArray[top]; // Return top element without removing
            } else {
                System.out.println("Stack is empty! Cannot peek.");
                return -1;
            }
        }

        public boolean isEmpty() {
            return top == -1; // Check if the stack is empty
        }

        public boolean isFull() {
            return top == maxSize - 1; // Check if the stack is full
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(5);

        while (!stack.isFull()) {
            System.out.println("Enter the data: ");
            stack.push(in.nextInt());
        }

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}

