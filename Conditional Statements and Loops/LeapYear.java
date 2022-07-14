import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class LeapYear{
  public static void main(String[] args){
    System.out.println("Enter Year: ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year % 4 == 0){
	    System.out.println("Leap Year");
    }
    else if (year % 100 == 0){
	    System.out.println("Leap Year");
    }
    else if (year % 400 == 0){
	    System.out.println("Leap Year");
    } 
    else 
	    System.out.println("Not A Leap Year");
    }
}