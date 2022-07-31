import java.lang.*;
import java.util.Scanner;

public class traverse{
  public static void main(String[] args){
    int A[][] = {{10, 20, 30},{40, 50, 60},{70, 80, 90}}; 
   
    // Two Approach (Use one at time)
    // Traversing using for loop
    for(int i=0; i<A.length; i++){
      for (int j=0; j<A[0].length; j++){
        System.out.print(A[i][j] + " ");
      }
      System.out.print("\n");
    }

    //Traversing using for each loop
    for(int x[] : A){
      for(int y : x){
        System.out.print(y + " ");
      }
      System.out.print("\n");
    }
  }
}