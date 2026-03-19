package Stacks;

import java.util.Scanner;

public class StackArray {

    static int MAX = 10;
    static int[] stack = new int[MAX];
    static int top = -1;

    // Push operation
    static void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    // Pop operation
    static int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    static int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Display stack
    static void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        push(10);
        push(20);
        push(30);

        display(); // 30 20 10

        System.out.println("Top: " + peek()); // 30

        System.out.println("Popped: " + pop()); // 30

        display(); // 20 10
    }
}