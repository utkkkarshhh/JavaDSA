import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class Age {
  public static void main (String[] args){
    System.out.println("Enter the age");
    Scanner age = new Scanner (System.in);
    int a = age.nextInt();
    if (a >= 14 && a <= 55){
      System.out.println("The Person is Young!");
    }
    else 
      System.out.println("The Person is not Young");
  }
}