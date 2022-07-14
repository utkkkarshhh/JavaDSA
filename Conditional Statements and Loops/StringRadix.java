import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class StringRadix{
  public static void main(String[] args){
    System.out.println("Enter a number");
    Scanner radix = new Scanner (System.in);
    String number = radix.nextLine();

    if (number.matches("[01]+")){
      System.out.println("Binary. Radix = 2");
    }
    else if (number.matches("[0-9]+")){
      System.out.println("Decimal. Radix = 10");
    }
    else if (number.matches("[0-7]+")){
      System.out.println("Octal. Radix = 8");
    }
    else if (number.matches("[0-9A-F]+")){
      System.out.println("Hexadecimal. Radix = 16");
    }
    else 
      System.out.println("Invalid Number");
  }
}