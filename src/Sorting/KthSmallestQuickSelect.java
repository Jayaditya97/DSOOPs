package Sorting;

import java.util.Scanner;

public class KthSmallestQuickSelect {

    // Partition function (same as Quick Sort)
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    // Quick Select function
    static int quickSelect(int[] arr, int low, int high, int k) {

        if (low <= high) {

            int p = partition(arr, low, high);

            if (p == k - 1)
                return arr[p];

            else if (p > k - 1)
                return quickSelect(arr, low, p - 1, k);

            else
                return quickSelect(arr, p + 1, high, k);
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();      // kth smallest

        System.out.println(quickSelect(arr, 0, n - 1, k));
    }
}
