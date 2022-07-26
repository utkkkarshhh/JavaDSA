import java.util.Scanner;

public class arrange{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements in array : ");
    int n = sc.nextInt();

    // Declaring the array
    int A[] = new int [n];

    // Adding elements into array
    for(int i = 0; i < n; i++){
		A[i] = sc.nextInt();
	  }

    // Printing the array
    for(int i = 0; i < A.length; i++){
      System.out.print(A[i]+ ", ");
    }
    
  }
}