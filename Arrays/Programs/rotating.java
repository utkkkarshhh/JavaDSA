import java.lang.*;
import java.util.Scanner;

public class rotating{
  public static void main(String[] args){
    int A[] = {10, 20, 30, 40, 50, 60};
    for(int x: A){
      System.out.println(x);
    }
    
    int temp = A[0];
    for(int i = 1; i < A.length; i++){
      A[i - 1] = A[i];
    }
    
    A[A.length - 1] = temp;

    for(int x: A){
      System.out.print(x + ", ");
    }
  }
}