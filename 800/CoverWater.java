import java.util.Scanner;

public class CoverWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     

        int t = sc.nextInt();
        while(t-- >0){


        int n = sc.nextInt(); 
        boolean flag = false;

        String str = sc.next(); 
        int count = 0;



            for (int i = 1; i <  n; i++) { 
    
                if (str.charAt(i) == '.') {
                    count++;
                }

              
                if (str.charAt(i - 1) == '.' && str.charAt(i) == '.' && str.charAt(i + 1) == '.') {
                    System.out.println("2");
                    flag = true;
                }
            }

            if (flag) {
                System.out.println(count);
            }
        }

        sc.close(); 
    }
}
