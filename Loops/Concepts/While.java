import java.lang.*;
import java.util.Scanner;
import java.util.*;

// Print 1-10
public class While {
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int a = 1;
    while(a <= 10){
      System.out.println(a);
      a++;
    }
  }
}