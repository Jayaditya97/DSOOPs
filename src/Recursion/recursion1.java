package Recursion;
import java.util.Scanner;
public class recursion1 {
    //print n to 1 by using recursion;\
    public static void nto1(int n){
        if(n==0) return;
        System.out.println(n);
        nto1(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nto1(n);
    }
}
