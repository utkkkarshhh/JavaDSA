import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class NestedIf
{
	public static void main(String[] args) {
		System.out.println("Enter 3 Numbers to Find the Biggest");
    Scanner number = new Scanner (System.in);
    int a = number.nextInt();
    int b = number.nextInt();
    int c = number.nextInt();
		if (a > b && a > c) {
		    System.out.println("A is the Biggest Number: " + a);
		}
		else if (b > c){
		    System.out.println("B is the Biggest Number: " + b);
		    }
		else {
		    System.out.println("C is the Biggest Number: " + c);
		    }
	}
}