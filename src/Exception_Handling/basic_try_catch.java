package Exception_Handling;

import java.util.Scanner;

public class basic_try_catch {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result = "+ result);
        }
        catch(Exception e){ //throwable
            System.out.println("Wrong value entered. Enter Again");
        }
    }
}