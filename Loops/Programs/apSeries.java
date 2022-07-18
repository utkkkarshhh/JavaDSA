import java.lang.*;
import java.util.Scanner;

public class apSeries{
  public static void main(String[] args){
    System.out.println("Enter First Digit, Difference and number of terms: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();
    int term = a;
    for(int i = 0; i <= n; i++){
      System.out.print(term + ",");
      term = term + d;
    }
  }
}