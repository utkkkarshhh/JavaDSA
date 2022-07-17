import java.util.Scanner;
import java.lang.*;

public class reverse {
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to reverse: ");
    int n = sc.nextInt();
    int r, rev = 0; 
    while(n > 0){
      r = n % 10;
      n = n / 10;
      rev = rev * 10 + r;
    }
    System.out.println("The reversed number is: " + rev);
  }
}