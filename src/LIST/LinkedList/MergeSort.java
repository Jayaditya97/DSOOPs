package LIST.LinkedList;
import java.util.*;

public class MergeSort {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // MAIN MERGE SORT FUNCTION
    Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = middle(head);
        Node second = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(second);

        return merge(left, right);
    }

    // FIND MIDDLE USING SLOW-FAST POINTER
    Node middle(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // MERGE TWO SORTED LISTS
    Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // attach remaining
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    // HELPER: PRINT LIST
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // TEST
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Before Sorting:");
        obj.printList(head);

        head = obj.mergeSort(head);

        System.out.println("After Sorting:");
        obj.printList(head);
    }
}