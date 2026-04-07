public class AdvancedCalculator {

    // Power Method
    public double power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("0 cannot have negative exponent");
        }
        return Math.pow(base, exponent);
    }

    // Square Root Method
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return Math.sqrt(number);
    }

    // Prime Check Method
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Factorial Method
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative factorial not allowed");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}