import java.util.*;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(); // Read k inside each test case
            
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> seen = new HashSet<>();
            for (int j : arr) {
                seen.add(j);
            }

            if (seen.contains(k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
