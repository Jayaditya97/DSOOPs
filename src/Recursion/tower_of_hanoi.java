package Recursion;

public class tower_of_hanoi {
    static void toh(int n, char src, char helper, char dest){
        if(n==1){
            System.out.println(src + " To " + dest );
            return;
        }
        toh(n-1,src,dest,helper);
        toh(1,src,helper,dest);
        toh(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
}