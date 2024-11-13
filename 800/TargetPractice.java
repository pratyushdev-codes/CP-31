import java.util.Scanner;

public class TargetPractice {
    public static int[][] board = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
        {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
        {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
        {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
        {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
        {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
        {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
        {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int total = 0; 

   
            for (int i = 0; i < 10; i++) {
                String row = sc.next(); // Read the current row as a string

                // Iterate over each column in the row
                for (int j = 0; j < 10; j++) {
                    char ch = row.charAt(j); // Get the character at position (i, j)

           
                    if (ch != '.') {
                        total += board[i][j]; 
                    }
                }
            }

 
            System.out.println(total);
        }

        sc.close();
    }
}
