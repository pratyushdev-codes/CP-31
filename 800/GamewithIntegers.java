/**
 * GamewithIntegers
 */
import java.util.*;
public class GamewithIntegers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t= sc.nextInt();
        while (t-- >0) { 
         
            int x = sc.nextInt();

            if(x%3==0){
               System.out.println("Second");
            
        }else{
            System.out.println("First");
        }
       
        
    }
}
}