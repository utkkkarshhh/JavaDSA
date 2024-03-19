// LINEAR SEARCH

import java.util.Scanner;

public class linearSearch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [5];
		
		for(int i = 0; i < A.length; i++){
		    A[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number you want to find in the array: ");
		int n =sc.nextInt();

        for(int i = 0; i < A.length; i++){
            if(A[i] == n){
                System.out.println(n + " is found on " + i + " index!");
            }
        }
		
	}
}
