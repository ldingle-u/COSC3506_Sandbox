//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
    
        // my addition - if base is zero and exponent is negative
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Division by zero. Zero cannot have negative exponent");
        }
        // my addition ends here

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
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        int result = 1;
        // Iteratively calculates factorial in an ascending fashion
        for (int i = 1; i <= number; i++) {
            
            // my addition - for finding factorials of longer numbers
            // did Integer.MAX_VALUE / i instead of (result * i) as it would silently overflow
            if (result > (Integer.MAX_VALUE / i)) {
                throw new ArithmeticException("Result getting too long. Will need larger data type");
            }
            // my addition ends
            
            result *= i;

        }
        return result;
    }
}
