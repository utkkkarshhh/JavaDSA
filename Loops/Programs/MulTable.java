import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class MulTable{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to print a table for: ");
    int num = sc.nextInt();
    System.out.println("Enter the range of the table: ");
    int range = sc.nextInt();
    for (int i = 1; i <= range ; i++){
      System.out.println(num + " * " + i + " = "+ num * i);
    }
  }
}