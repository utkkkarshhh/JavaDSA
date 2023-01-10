public class prime {

    static boolean isPrime(int prime) {
        for (int i = prime; i < prime / 2; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(19));
    }
}
