package Stacks;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] a = {2,1,5,6,2,3};
        int n = a.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && a[left] >= a[i]) {
                left--;
            }
            while (right < n && a[right] >= a[i]) {
                right++;
            }

            int width = right - left - 1;
            int area = width * a[i];

            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
    }
}