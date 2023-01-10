public class methOver {

    // static int area(int length, int breadth) {
    // return length * breadth;
    // }

    // static double area(double radius) {
    // return Math.PI * radius * radius;
    // }

    // static int reverse(int number) {
    // int rev = 0;
    // while (number != 0) {
    // rev = rev * 10 + number % 10;
    // number = number / 10;
    // }
    // return number;
    // }

    // static int[] reverse(int A[]) {
    // int B[] = new int[A.length];
    // for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
    // B[j] = A[i];
    // }
    // for (int x : B) {
    // System.out.print(x + " ");
    // }
    // return B;
    // }

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age) {
        return age >= 3 && age <= 15;
    }

    public static void main(String[] args) {
        System.out.println(validate("Utkarsh Bhardwaj"));
        System.out.println(validate(12));
        System.out.println(validate(18));
    }
}