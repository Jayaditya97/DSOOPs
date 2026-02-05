package Recursion;

import java.util.Scanner;

public class suofdigits {
    static int sum(int n){
        // Base case
        if (n == 0)
            return 0;

        // Recursive case
        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));
    }
}
