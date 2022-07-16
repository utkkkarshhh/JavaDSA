import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class factorialOfN{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Find the factorial of N Numbers: ");
    int n = sc.nextInt();
    int pos = 1;
    for (int i = 1; i <= n; i++){
      pos = pos * i;
    }
    System.out.println(pos);
  }
}