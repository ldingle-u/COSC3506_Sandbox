import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // Error cannot divide by zero if base is zero and exponent is less than one
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
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

    // Calculates factorial of a number
    // Changed to return long to store larger numbers
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        // Converted it to a long to hold larger numbers
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}