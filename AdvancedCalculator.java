//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    /*
     * Calculates the power of a number
     *
     * Issue: power(0, -1) returns positive infinity, when it should throw an IllegalArgumentException
     */
    public double power(double base, int exponent) {

        // Fix: throw an IllegalArgumentException if base == 0 && exponent < 0.
        if (exponent < 0) {
            if(base == 0)
                throw new IllegalArgumentException();
            return 1 / Math.pow(base, -exponent);
        }
        // Return a double, represents base raised to the exponent
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
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
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Calculates factorial of a number
     *
     * Issue: factorial(20) originally returned -2102132736, which is incorrect.
     * This is because the max int value < factorial(20).
     *
     * Fix: throw IllegalArgumentException when factorial(number) > max int value,
     * which is when number >= 13.
     */
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        // Fix
        if(number >= 13) {
            throw new IllegalArgumentException("Factorial exceeds maximum integer value");
        }

        int result = 1;
        // Iteratively calculates factorial in an ascending fashion
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
