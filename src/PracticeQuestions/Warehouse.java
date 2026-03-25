package PracticeQuestions;

import java.util.*;

public class Warehouse {

    static String canReorder(int[] arrival, int[] dispatch, int n) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            // Push incoming box
            stack.push(arrival[i]);
            // Check if top matches dispatch
            while (!stack.isEmpty() && stack.peek() == dispatch[j]) {
                stack.pop();
                j++;
            }
        }
        // If stack empty → possible
        if (stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrival = new int[n];
        int[] dispatch = new int[n];
        for (int i = 0; i < n; i++)
            arrival[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            dispatch[i] = sc.nextInt();
        System.out.println(canReorder(arrival, dispatch, n));
    }
}