package Binary;

import java.util.Scanner;

public class UniqueElement {

    static int findUnique(int[] arr, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findUnique(arr, n));
    }
}
