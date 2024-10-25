import java.util.Scanner;

public class DontCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            String x = sc.next();
            String s = sc.next();
            
    
            boolean found = false;
            StringBuilder currentX = new StringBuilder(x);
            
            for (int i = 0; i < 5; i++) {
                if (currentX.toString().contains(s)) {
                    System.out.println(i);
                    found = true;
                    break;
                }
                currentX.append(currentX); 
            }
            
            if (!found) {
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
