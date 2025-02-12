import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline after nextInt()
        
        while (t-- > 0) {
            String str = sc.nextLine();
            int zero = (int) str.chars().filter(ch -> ch == '0').count();
            int one = str.length() - zero;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    if (one > 0) one--;
                    else break;
                } else {
                    if (zero > 0) zero--;
                    else break;
                }
            }
            System.out.println(zero + one);
        }
        sc.close(); // Close the scanner
    }
}
