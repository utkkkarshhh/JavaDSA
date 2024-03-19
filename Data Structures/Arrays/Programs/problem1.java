// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class problem1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A[] = new String [3];
		
		for(int i = 0; i < A.length; i++){
		    A[i] = sc.nextLine();
		}


        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
		
	}
}
