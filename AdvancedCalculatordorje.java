public class AdvancedCalculatordorje {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // Fix: Handle undefined case when base is 0 and exponent is negative (division by zero)
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Cannot raise 0 to a negative power");
        }

        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        // Already handled: throws IllegalArgumentException for negative input
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

        // Fix: changed loop condition from i < Math.sqrt(number) to i <= Math.sqrt(number)
        // to correctly check divisibility for squares like 9 (3*3)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public long factorial(int number) {
        // Already handled: throws exception for negative input
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        // Fix: changed return type from int to long to support large values like factorial(20)
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
