import java.util.Scanner;
import java.lang.*;

public class palindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int m = n;
    int r, rev = 0;
    while (n > 0){
      r = n % 10;
      n = n / 10;
      rev = rev * 10 + r;
    }
    if ( rev == m){
      System.out.println("The number is a palindrome");
    }
    else System.out.println("The number is not a palindrome");
  }
}