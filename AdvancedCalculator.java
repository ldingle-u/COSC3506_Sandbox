public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // FIX: Added check to handle 0 raised to negative exponent
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Zero cannot be raised to a negative exponent");
        }
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        if (number < 0) {
            // Already handled: exception for negative square root
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {  // FIXED: added '='
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        // FIX: Changed return type from int to long to avoid integer overflow
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
