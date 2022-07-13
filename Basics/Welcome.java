import java.lang.*;
import java.util.Scanner;

class Welcome{
  public static void main(String[] args){
    System.out.println("Hi, What is you Name?");
    Scanner s = new Scanner (System.in);
    String name;
    name = s.next();
    System.out.println("Hi, "+ name + ". We hope you're doing great!");
  }
}