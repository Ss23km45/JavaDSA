package stack;

import java.util.Stack;

public class StackDsa {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Stack1");
        stack.push("Stack2");
        stack.push("Stack3");
        System.out.println(stack);
        System.out.println(stack.empty());
        String vla = stack.pop();
        System.out.println(vla);
        System.out.println(stack.peek());
    }
}
