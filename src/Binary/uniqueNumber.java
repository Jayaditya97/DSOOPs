package Binary;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,2};
        int ans = 0;

        for(int x: arr) ans^=x;
    }
}
