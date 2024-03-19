import java.util.Scanner;

public class deletion{
  public static void main(String[] args){
      int A[] = {5, 9, 6, 10, 12, 17};
      
    //   Taking the element user wants to delete
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number you want to remove: ");
    int n = sc.nextInt();
      
    //   Deleting the element from array
    for(int i = 0; i < A.length; i++){
        if(A[i] == n){
            for(int j = i; j < A.length - 1; j++){
                A[j] = A[j + 1];
            }
            break;
        }
    }
      
    //   Printing the new array
      for(int i = 0; i < A.length - 1; i++){
        System.out.print(A[i] + " ");
      }
  }
}