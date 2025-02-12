import java.util.Scanner;

public class SwapandDelete {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int s= sc.nextLine();
            int n = s.length();

            int count1 =0;
            int coint0 = 0;

            for(int i = 0 ; i<s.length(); i++){
                if(s.charAt[i]=='1'){
                    coint1++;
                }

    
              
            }

            // no. of 0a --> n- count1
            coint0= n-count1;
            int totalSwaps= 0;
            for(int i = 0; i<n; i++){
                // the number the we ca swap will be i 

                if(s.charAt[i]==='1'){
                    if(count1>0){
                        count1--;
                    }else{
                        break;
                    }
                }else if(s.charAt[i]=='0'){
                    count0--;
                }else{
                    break;
                }
                System.out.println(n-i);

            }
   
        }
    
    }
}