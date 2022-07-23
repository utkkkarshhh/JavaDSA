public class starChallenge{
  public static void main(String[] args){
    for(int i = 1; i<=5; i++){
      for(int j = 1; j<=5; j++){
        if(i+j > 5){
          System.out.print("* ");
        }
        else
          System.out.print("  ");
      }
      for (int f = 2; f<=i; f++){
          System.out.print("* ");
        
      }
      System.out.println("");
    }
    for(int l = 1; l<=5; l++){
        for(int m = 1; m<=5; m++){
            if(m>l){
                System.out.print("* ");
            }
            else
            System.out.print("  ");
        }
        
        for(int n = 4; n > l; n--){
                System.out.print("* ");
        }
        
        System.out.println(" ");
    }
  }
}