
//Passing object as a paramteter/argument
public class paramPassObj{
 
    static void welcome(String n){
        System.out.println("Welcome Mr/Ms. " + n);
    }

    public static void main(String[] args) {
        String name = "Joseph";
        welcome(name);   
    }
}