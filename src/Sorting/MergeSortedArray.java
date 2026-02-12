package Sorting;

import java.util.Scanner;

public class MergeSortedArray {

    static int[] merge(int[] a, int[] b, int n, int m) {

        int[] c = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[]
        while (i < n) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b[]
        while (j < m) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First array
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Second array
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = merge(a, b, n, m);

        // Print merged array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

