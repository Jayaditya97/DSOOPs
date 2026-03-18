package PracticeQuestions;

//Question 1 — E-commerce Discount
//Optimizer (Recursion + Choice)
//Problem Statement An online store gives discount coupons.Each coupon reduces price by a certain value.
//You must find the minimum payable price by choosing any subset of coupons.
import java.util.Scanner;

public class EcommerceDiscount {
    static int maxDiscount(int[] arr, int i, int n, int currentSum, int price) {
        if (currentSum > price)
            return 0;
        if (i == n)
            return currentSum;
        int take = maxDiscount(arr, i + 1, n, currentSum + arr[i], price);
        int skip = maxDiscount(arr, i + 1, n, currentSum, price);
        return Math.max(take, skip);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int bestDiscount = maxDiscount(arr, 0, n, 0, price);
        int minPrice = price - bestDiscount;
        System.out.println(minPrice);
    }
}