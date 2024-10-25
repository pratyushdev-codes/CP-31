import java.util.Scanner;
import java.util.*;
public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();//No. of test cases

        while(t-- >0){
            int n = sc.nextInt();  //now of elements

            int [] arr = new int [n];
            for(int i = 0; i < n; i++){
                arr[i]=sc.nextInt();

            }

              int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < n ; i++){
                min = Math.min(min,arr[i]);

            }

            if(arr[0]!=min){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }


       
        }
    }
}
