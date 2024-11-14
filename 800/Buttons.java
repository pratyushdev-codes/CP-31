import java.util.*;
public class Buttons {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t--> 0) {
      int a = sc.nextInt(); //pressed by Anna only
      int b = sc.nextInt(); //pressed by Katie only
      int c = sc.nextInt(); //can be pressed by either
      if (c % 2!=0 && a==b) System.out.println("First");
      else if (a > b) System.out.println("First");
      else System.out.println("Second");
    }
    sc.close();
  }
}