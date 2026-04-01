import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeDeque {
    public static boolean isPalindrome(String str) {
        Deque<Character> d = new ArrayDeque<>();

        // Add all characters to deque
        for (char c : str.toCharArray()) {
            d.addLast(c);
        }

        // Compare front and rear
        while (d.size() > 1) {
            if (d.removeFirst() != d.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "madam";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}