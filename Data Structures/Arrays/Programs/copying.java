import java.lang.*;
import java.util.Scanner;

public class copying{
  public static void main(String[] args){
    int A [] = {10, 20, 30, 40, 50};
    int B [] = new int [A.length];
    
    // Traversing the array array
    for(int i = 0; i < A.length; i++){
        B[i] = A[i];
    }

    // Printing the array
    for(int i = 0; i <A.length; i++){
      System.out.println(B[i]);
    }
  }
}