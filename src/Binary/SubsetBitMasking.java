package Binary;

import java.util.Scanner;

public class SubsetBitMasking {

    static void generateSubset(int[] arr, int n) {

        int total = 1 << n;   // 2^n subsets

        for (int mask = 0; mask < total; mask++) {

            for (int i = 0; i < n; i++) {

                // Check if i-th bit is set
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubset(arr, n);
    }
}
