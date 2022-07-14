import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class OddEven {
  public static void main (String[] args){
    System.out.println("Enter a number to find whether it is Odd or Even");
    Scanner number = new Scanner (System.in);
    int a = number.nextInt();
    if (a % 2 == 0){
      System.out.println("Number is Even");
    }
    else
      System.out.println("Number is Odd");
  }
}