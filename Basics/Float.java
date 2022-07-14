import java.lang.*;
import java.util.Scanner;

public class Float{
  public static void main (String[] args) {
    System.out.println("Enter your marks");
    Scanner input = new Scanner (System.in);
    float marks = input.nextFloat();
    System.out.println("Your marks are: " + marks);
  }
}