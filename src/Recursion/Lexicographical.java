package Recursion;
//arranges numbers as alphabetical order
public class Lexicographical {

    static void lexico(int curr, int end) {

        // Base case
        if (curr > end)
            return;

        System.out.println(curr);

        // Try next digits 0 to 9
        for (int i = 0; i <= 9; i++) {

            int next = curr * 10 + i;

            if (next <= end) {
                lexico(next, end);
            }
        }
    }

    public static void main(String[] args) {

        int n = 25;   // Change as needed

        for (int i = 1; i <= 9; i++) {
            lexico(i, n);
        }
    }
}
