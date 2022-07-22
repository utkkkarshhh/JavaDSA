import java.lang.*;
import java.util.Scanner;

public class pyramid{
  public static void main(String[] args){
    for(int i = 1; i<=5; i++){
      for(int j = 1; j<=5; j++){
        if(i+j > 5){
          System.out.print("* ");
        }
        else
          System.out.print("  ");
      }
      for (int f = 2; f<=i; f++){
          System.out.print("* ");
        
      }
      System.out.println(" ");
    }
  }
}