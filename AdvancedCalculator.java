// Calculator that calculates factorial, exponents and checks if a number is prime
import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        if (exponent < 0) {
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
    // FIX: Changed loop condition from i < Math.sqrt(number) to i <= Math.sqrt(number)
    // The previous condition would incorrectly identify perfect squares as prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    // FIX: Changed return type from int to BigInteger to handle large values like 20!
    // Factorial of 20 exceeds int max value (2,147,483,647)
    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}