public class variableArgs {

    // static void show(int... A) {
    // for (int x : A) {
    // System.out.println(x);
    // }
    // }

    static void showList(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + ". " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(5, "Hi", "Hello", "Ola");
    }
}
