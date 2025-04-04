import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // added check for 0 raised to a negative power, which is undefined
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Cannot raise 0 to a negative power");
        }
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent); // for negative exponents, return the reciprocal of the base raised to positive exponent
        }
        return Math.pow(base, exponent); // for positive exponents, use Math.pow
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        // ensures the number is non-negative before calculating square root
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number); // return the square root of the number
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // not prime
            }
        }
        return true; // prime
    }

    // Calculates factorial of a number
    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        // using BigInteger for handling large results
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
