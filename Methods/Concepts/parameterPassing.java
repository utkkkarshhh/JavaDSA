public class parameterPassing{
 
    static int add(int x, int y){
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);

    }
}