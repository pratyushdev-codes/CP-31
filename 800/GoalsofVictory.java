import java.util.Scanner;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of teams
            int[] efficiencies = new int[n - 1]; // Efficiency of n-1 teams
            int sum = 0;

            for (int i = 0; i < n - 1; i++) {
                efficiencies[i] = sc.nextInt();
                sum += efficiencies[i];
            }

            int missingEfficiency = -sum; // Efficiency of the missing team
            System.out.println(missingEfficiency);
        }
        
        sc.close();
    }
}
