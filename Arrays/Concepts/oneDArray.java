import java.lang.*;
import java.util.Scanner;

public class oneDArray{
  public static void main(String[] args){
    int A [] = new int [5];
    int B [] = {1, 2, 3, 4, 5};
    int C [];
    C = new int [10];
    int [] D = new int [5];
    B[2] = 61;
    for(int i = 0; i <= B.length; i++){
      System.out.println(i + " = "  + B[i]);
    }
  }
}