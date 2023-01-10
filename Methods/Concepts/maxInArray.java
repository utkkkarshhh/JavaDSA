public class maxInArray {
    static int max(int x[]) {
        int maximum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maximum) {
                maximum = x[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int A[] = { 8, 3, 15, 9, 7 };
        System.out.println(max(A));
        for (int x : A) {
            System.out.print(x + " ");

        }
    }
}
