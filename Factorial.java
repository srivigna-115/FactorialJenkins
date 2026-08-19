public class Factorial {
    public static long compute(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number not allowed");
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /*public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + compute(number));
    }*/
}