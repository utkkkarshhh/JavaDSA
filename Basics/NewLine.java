import java.lang.*;
import java.util.Scanner;

public class NewLine {
  public static void main(String[] args){
    System.out.println("Hi, What is your name?");
      Scanner name = new Scanner (System.in);
      System.out.println("Hello, " + name.nextLine());
  }
}