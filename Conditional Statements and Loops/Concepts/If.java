import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class If{
  public static void main(String[] args){
    System.out.println("Enter Two Numbers to Find the Biggest");
    Scanner number = new Scanner (System.in);
    int a = number.nextInt();
    int b = number.nextInt();
    if (a > b){
      System.out.println("A Is Bigger: " + a);
    }
    else {
      System.out.println("B Is Bigger: " + b);
    }
  }
}