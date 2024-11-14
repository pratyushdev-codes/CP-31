import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // size of array
            int[] arr = new int[n];
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Check if array is already non-sorted
            boolean isSorted = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i-1]) {
                    isSorted = false;
                    break;
                }
            }
            
            if (!isSorted) {
                System.out.println(0);
                continue;
            }
            
            // Find minimum difference between adjacent elements
            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int diff = arr[i] - arr[i-1];
                minDiff = Math.min(minDiff, diff);
            }
            
            // Calculate operations needed
            System.out.println((minDiff / 2) + 1);
        }
    }
}