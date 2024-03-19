// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int [5];
		
		System.out.println("Enter " + A.length + " elements!");
		
		for(int i = 0; i < A.length; i++){
		    A[i] = sc.nextInt();
		}

        for(int i = 0; i < A.length - 1; i++){
            if(A[i] < A[i + 1]){
                System.out.println("Sorted Array");
            }
            if(A[i] > A[i + 1]){
                System.out.println("Unsorted Array");
            }
        }
		
	}
}
