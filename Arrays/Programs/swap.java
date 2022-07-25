import java.lang.*;
import java.util.Scanner;

public class swap{
  public static void main(String[] args) {
    int S [] = {2, 1, 9, 3, 10, 15};

    for(int i = 0; i < S.length; i += 2){
      int temp = S[i];
      S[i] = S [i + 1];
      S [i + 1] = temp;
    }
    
    for(int i = 0; i < S.length; i++){
      System.out.print(S[i] + ", ");
    }
  }
}