import java.lang.*;
import java.util.*;

class Main {
  public static void main (String args[]){
    Scanner s = new Scanner(System.in);
   int a, b, c;
    System.out.println("Enter two numbers for additon: ");
   a = s.nextInt();
   b = s.nextInt();
   c = a + b;
    System.out.println("Sum is: " + c);
  }
}