package Stacks;

import java.util.*;

class next_greater_element_left_side {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(st.peek() + " ");
            }

            st.push(arr[i]);
        }
    }
}