import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> arr2 = new ArrayList<>();

            // Add the first element of arr to arr2 initially
            arr2.add(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= arr[i - 1]) {
                    arr2.add(arr[i]);
                } else {
                    arr2.add(arr[i]);
                    arr2.add(arr[i]);
                }
            }

            System.out.println(arr2.size());
            for (int num : arr2) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
