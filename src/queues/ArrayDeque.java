package queues;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new java.util.ArrayDeque<>();

        d.addFirst(1);
        d.addLast(2);

        int f = d.removeFirst();
        int l = d.removeLast();

        System.out.println(f + l);
    }
}