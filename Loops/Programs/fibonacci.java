import java.lang.*;
import java.util.Scanner;

public class fibonacci{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First and Second term & N");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int c = 0;
    for (int i = 0; i < n; i++){
      c = a + b;
      System.out.print(c + ",");
      a = b;
      b = c;
    }
  }
}