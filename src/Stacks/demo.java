package Stacks;

import java.util.Stack;

public class demo {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);

        // Print stack
        System.out.println("Stack: " + s);

        // Peek (top element)
        System.out.println("Top: " + s.peek());

        // Pop element
        System.out.println("Popped: " + s.pop());

        // After pop
        System.out.println("Stack after pop: " + s);

        // Size
        System.out.println("Size: " + s.size());
    }
}