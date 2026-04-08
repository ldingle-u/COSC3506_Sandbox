public class AdvancedCalculator {

    // Power: handles negative exponents, returns double, throws for 0^negative
    public double power(int base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Cannot raise 0 to a negative exponent");
        }
        if (exponent == 0) return 1;
        double result = 1.0;
        int absExp = Math.abs(exponent);
        for (int i = 0; i < absExp; i++) {
            result *= base;
        }
        return exponent > 0 ? result : 1.0 / result;
    }

    // SquareRoot: throws exception for negative input
    public double squareRoot(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number");
        }
        return Math.sqrt(value);
    }

    // IsPrime: correctly identifies primes, 1 and negatives return false
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Factorial: uses long, throws for negatives, computes up to 20! correctly
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}