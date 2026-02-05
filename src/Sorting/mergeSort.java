package Sorting;

public class mergeSort {

    // Merge function
    static void merge(int[] arr, int l, int m, int r) {

        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            arr[i] = temp[k];
    }

    // Recursive merge sort
    static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 6, 1, 3};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }
}