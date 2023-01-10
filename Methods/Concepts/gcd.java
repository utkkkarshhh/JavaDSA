public class gcd {

    static int isgcd(int m, int n) {
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(isgcd(35, 56));
    }
}
