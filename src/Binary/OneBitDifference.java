package Binary;

import java.util.Scanner;

public class OneBitDifference {
//method 1
    static boolean differByOneBit(int a, int b) {

        int x = a ^ b;

        // x must have exactly one set bit
        return (x > 0) && ((x & (x - 1)) == 0);
    }

//method 2
//    static boolean differByOneBit(int a, int b) {
//
//        int x = a ^ b;
//        int count = 0;
//
//        while (x > 0) {
//            count += (x & 1);
//            x = x >> 1;
//        }
//
//        return count == 1;
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(differByOneBit(a, b));
    }
}
