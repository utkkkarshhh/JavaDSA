import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class sumOfN{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Find the sum of N Natural Numbers: ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n ; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
}