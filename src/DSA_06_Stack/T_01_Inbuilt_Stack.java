package DSA_06_Stack;

import java.util.Stack;

public class T_01_Inbuilt_Stack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('S');
        stack.push('U');
        stack.push('S');
        stack.push('H');
        stack.push('I');
        stack.push('L');

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.empty());

        System.out.println(stack.search('H'));

        System.out.println(stack.contains('P'));

        System.out.println(stack.capacity());

        System.out.println(stack.pop());
    }
}
