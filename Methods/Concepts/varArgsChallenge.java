//Challenge 1
// public class varArgsChallenge {

//     static int max(int... A) {
//         if (A.length == 0) {
//             return Integer.MIN_VALUE;
//         }
//         int max = A[0];
//         for (int i = 0; i < A.length; i++) {
//             if (A[i] > max) {
//                 max = A[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         System.out.println(max());
//         System.out.println(max(10, 20, 30, 40, 50, 60));
//         System.out.println(max(9, 97, 1964, 5, 564, 648));
//         System.out.println(max(58));
//     }
// }

// Challenge 2

// public class varArgsChallenge {

//     static int sum(int... A) {
//         if (A.length == 0) {
//             return 0;
//         }
//         int sum = 0;
//         for (int i = 0; i < A.length; i++) {
//             sum += A[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(10, 20, 30, 40, 50));
//         System.out.println(sum());
//     }
// }

//Challenge 3

public class varArgsChallenge {

    static double discount(double... price) {
        int discount = 0, cost = 0;
        for (int i = 0; i < price.length; i++) {
            cost += price[i];
        }
        discount = cost * 20 / 100;
        return discount;
    }

    public static void main(String[] args) {
        System.out.println(discount(100, 200, 300, 400, 500));
    }
}