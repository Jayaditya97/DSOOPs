package Binary;

import java.util.Scanner;

public class PowerOfTwo {

    static boolean isPowerOfTwo(int n) {

        // Power of 2 must be positive
        if (n <= 0)
            return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}
