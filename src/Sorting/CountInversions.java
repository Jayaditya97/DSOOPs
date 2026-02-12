package Sorting;

import java.util.Scanner;

public class CountInversions {

    static int merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        int invCount = 0;

        // Merge and count inversions
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                invCount += (n1 - i); // key step
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];

        return invCount;
    }

    static int mergeSort(int[] arr, int l, int r) {

        int invCount = 0;

        if (l < r) {
            int m = (l + r) / 2;

            invCount += mergeSort(arr, l, m);
            invCount += mergeSort(arr, m + 1, r);
            invCount += merge(arr, l, m, r);
        }

        return invCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(mergeSort(arr, 0, n - 1));
    }
}
