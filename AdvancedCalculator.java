import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        if (exponent < 0) {
            if(base == 0) //checks if divides by 0 because a negative exponent would mean that the base is 0.
                throw new IllegalArgumentException("If exponent is negative, base cannot be zero");
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

    //returns a BigInteger to solve the issue where big factorials could not be calculated
    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
            //throws an exception for a negative number
        }

        //result will be stored as a BigInteger to allow storage of big values
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            //valueOf returns a BigInteger value of i
        }
        return result;
    }
}