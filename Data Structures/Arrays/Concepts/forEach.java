import java.lang.*;
import java.util.Scanner;

public class forEach{
  public static void main(String[] args){
    int A [] = {1, 2, 3, 4, 5};
    A[4] = 15;

    // Increament their value

    for(int i = 0; i <= A.length; i++){
      System.out.println(A[i]++);
    }
    
    for (int x: A) {
      System.out.println(x);
    }
  }
}