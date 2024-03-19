import java.lang.*;
import java.util.Scanner;

public class increaseArray{
  public static void main(String[] args){
    int A [] = {10, 20, 30, 40, 50};
    int B [] = new int [2 * A.length];
    System.out.println(A.length);
    
    for(int i = 0; i <A.length; i++){
        B[i] = A[i];
    }
    A = B;
    B = null;
    
    // Printing the array
    for(int i = 0; i <A.length; i++){
      System.out.println(A[i] + " " + A.length);
    }
  }
}