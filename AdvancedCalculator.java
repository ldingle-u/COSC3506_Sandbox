public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // Fix is to prevent math errors when trying to raise zero to negative powers
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Can't raise zero to a negative power - that's undefined");
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
        // Fixed the prime checker to properly catch all non-prime numbers
        if (number <= 1) {
            return false; // 0 and 1 aren't considered prime
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Found a divisor other than 1 and itself
            }
        }
        return true;
    }


    // Calculates factorial of a number
    public long factorial(int number) {
        // Changed to use long to handle big factorial results
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        long result = 1;
        // Start from 2 since multiplying by 1 doesn't change the result
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}