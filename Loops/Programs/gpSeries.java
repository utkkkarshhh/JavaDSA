import java.lang.*;
import java.util.Scanner;

public class gpSeries{
  public static void main(String[] args){
    System.out.println("Enter First Term, GP and N");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int gp = sc.nextInt();
    int n = sc.nextInt();
    int term = a;
    for (int i = 0; i <= n; i++){
      System.out.print(term + ",");
      term = term * gp;
    }
  }
}