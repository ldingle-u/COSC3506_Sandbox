// Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {

        // Fixed issue: 0 cannot be raised to a negative exponent
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("0 cannot be raised to a negative exponent");
        }

        // Handle negative exponent
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }

        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {

        // Fixed issue: negative numbers should throw exception
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }

        return Math.sqrt(number);
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        // Fixed improvement: include sqrt boundary
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Calculates factorial of a number
    public long factorial(int number) {

        // Fixed issue: negative numbers not allowed
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        // Fixed issue: use long to handle large values like 20!
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
