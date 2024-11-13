import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 1; // Number of test cases (fixed at 1, can be changed if needed)
        while (T-- > 0) {
            solve(sc);
        }
        sc.close(); // Close the scanner to avoid resource leak
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong(); // Number of elements in the array

        long minOper = Long.MAX_VALUE; // Initialize with a large value
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            if (t == 0) {
                minOper = 0;
                break; // No need to continue if a zero is found
            }
            minOper = Math.min(minOper, Math.abs(t)); // Find the minimum absolute value
        }

        System.out.println(minOper);
    }
}
