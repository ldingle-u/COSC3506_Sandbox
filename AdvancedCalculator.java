// Verified by JUnit tests (Dec 1, 2025): all behaviors match
// assignment requirements; no defects found during testing.
public class AdvancedCalculator {
// Behaviour: 0 with negative exponent throws ArithmeticException (tested in JUnit).

    public static double power(double base, int exponent) {
        if (base == 0 && exponent < 0)
            throw new ArithmeticException("Cannot raise 0 to a negative power.");
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        if (num < 0)
            throw new IllegalArgumentException("Cannot take square root of negative number.");
        return Math.sqrt(num);
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            // Protect against overflow since results beyond 20! do not fit in a long
            if (result > Long.MAX_VALUE / i)
                throw new IllegalArgumentException("Factorial result exceeds long range.");
            result *= i;
        }
        return result;
    }
}
