import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class SwitchCase{
  public static void main(String[] args){
    System.out.println("Enter day number to find the day");
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch(day){
      case 1: 
        System.out.println("The day is Monday");
        break;
      case 2: 
        System.out.println("The day is Tuesday");
        break;
      case 3: 
        System.out.println("The day is Wednesday");
        break;
      case 4: 
        System.out.println("The day is Thursday");
        break;
      case 5: 
        System.out.println("The day is Friday");
        break;
      case 6: 
        System.out.println("The day is Saturday");
        break;
      case 7: 
        System.out.println("The day is Sunday");
        break;
    }
  }
}