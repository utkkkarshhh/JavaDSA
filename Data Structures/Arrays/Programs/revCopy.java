import java.lang.*;
import java.util.Scanner;

public class revCopy{
  public static void main(String[] args){
    int A [] = {10, 20, 30, 40, 50};
    int B [] = new int [A.length];
    
    // Traversing the array array
    for(int i = 0; i < A.length; i++){
        B[B.length - i - 1] = A[i];
    }

    // Printing the array
    for(int i = 0; i <B.length; i++){
      System.out.println("Index Number : " + i + " = " + B[i]);
    }
  }
}