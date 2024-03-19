import java.lang.*;
import java.util.Scanner;

public class sorting{
  public static void main(String[] args){
    String arr[] = {"Java", "Python", "Pascal","Smalltalk","Ada", "Basic"};

    java.util.Arrays.sort(arr);

    for(String x: arr){
      System.out.print(x + ", ");
    }
  }
}