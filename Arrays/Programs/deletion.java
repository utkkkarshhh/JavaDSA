import java.util.Scanner;

public class deletion{
  public static void main(String[] args){
      int A[] = {5, 9, 6, 10, 12, 17};
    //   Deleting the element from array
    int n = 9;
    for(int i = 0; i < A.length; i++){
        if(A[i] == n){
            for(int j = i; j < A.length; j++){
                A[j] = A[j + 1];
            }
            break;
        }
    }
      
    //   Printing the new array
      for(int i = 0; i < A.length; i++){
        System.out.print(A[i] + " ");
      }
  }
}