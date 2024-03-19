// Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class problem2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [6];
		
		System.out.println("Enter " + A.length + " elements!");
		
		for(int i = 0; i < A.length; i++){
		    A[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < A.length; i++){
           if(A[i] < min) {
               min = A[i];
           }
           if(A[i] > max) {
               max = A[i];
           }

		}
		System.out.println(max + ", " + min);
	}
}
