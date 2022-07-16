import java.lang.*;
import java.util.Scanner;

public class armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int r, arm = 0;
    while(n > 0){
      r = n % 10;
      n = n / 10;
      arm = arm + r * r * r;
      System.out.println("The armstrong number is" + arm);
    }
  }
}