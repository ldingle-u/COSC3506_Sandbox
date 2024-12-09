public class AdvancedCalculator {

    // Method to calculate power
    public double power(double base, int exponent) {
        // Added check to handle 0 raised to a negative power
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Cannot raise 0 to a negative power");
        }
        return Math.pow(base, exponent);
    }

    // Method to calculate square root
    public double squareRoot(double number) {
        // Added check to handle square root of negative numbers
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        // Added check to ensure numbers <= 1 are not considered prime
        if (number <= 1) {
            return false; // 1 and numbers <= 0 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate factorial
    public long factorial(int number) {
        // Added check to handle factorial of negative numbers
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            // Added check to handle overflow during factorial calculation
            if (result < 0) {
                throw new ArithmeticException("Factorial result is too large for long type");
            }
        }
        return result;
    }
}