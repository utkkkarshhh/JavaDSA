import java.lang.*;
import java.util.Scanner;

public class pattern{
  public static void main(String[] args){
    // With Counter
    int count = 0;
    for (int i = 1; i <= 5; i++){
      for (int j = 1; j <= 5; j++){
        System.out.format("%02d  ", ++count);
      }
      System.out.println("");
    }
    
  }
}