import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class Grade {
  public static void main (String[] args){
    System.out.println("Enter marks of 3 subjects: ");
    Scanner marks = new Scanner (System.in);
    int m1 = marks.nextInt();
    int m2 = marks.nextInt();
    int m3 = marks.nextInt();

    // Total Marks
    float total = m1 + m2 + m3;
    System.out.println("Total Marks Gained are: " + total);

    // Average
    float average = total / 3;
    System.out.println("Average of Marks are: " + average);

    // Grade
    if (average >= 70){
      System.out.println("A Grade");
    }
    else if (average >= 60 && average < 70){
      System.out.println("B Grade");
    }
    else if (average >= 50 && average <60){
      System.out.println("C Grade");
    }
    else if (average >= 40 && average <50){
      System.out.println("D Grade");
    }
    else 
      System.out.println("F Grade");
  }
}