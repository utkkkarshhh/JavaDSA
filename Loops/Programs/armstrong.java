import java.lang.*;
import java.util.Scanner;

public class armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int m = n;
    int r, sum = 0;
    while(n > 0){
      r = n % 10;
      n = n / 10;
      sum = sum + r * r * r;
    }
      System.out.println("Resultant is: " + sum);
    if (sum == m){
      System.out.println("Its an armstrong number!!");
    }
    else
      System.out.println("Not an armstrong number");
  }
}