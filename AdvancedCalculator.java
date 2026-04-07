//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        /*
        Solution 1: Added a IllegalArgumentException
        to catch when zero is raised to a negative exponent
        as previously the result would return Infinity.
        */
        if (exponent < 0 && base == 0) {
            throw new IllegalArgumentException("Zero cannot be raised to a negative exponent");
        }
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
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        /*
        Solution 2: Re-wrote the logic of the isPrime
        to include perfect prime numbers
        as previously they would return a logic error
         */
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    /*
    Solution 3: replaced int variable with double
    to allow for larger sized factorials
    as fac(20) was too large and returned an overflow
     */
    public double factorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        double result = 1;
        // Iteratively calculates factorial in an ascending fashion
        for (double i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
