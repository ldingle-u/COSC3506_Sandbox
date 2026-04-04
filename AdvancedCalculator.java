public class AdvancedCalculator {
    public double power(double base, int exponent) {
        // Original code did not handle (0, negative exponent)
        // This leads to division by zero (Infinity), which is incorrect
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("0 cannot have a negative exponent");
        }

        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }

        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Original loop used: i < Math.sqrt(number)
        // This misses cases where i == sqrt(number)
        // Example: number = 9 → sqrt(9)=3 → loop skips i=3 → wrong result
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long factorial(int number) {
        // Original code used int → causes overflow for large values like 20! (int cannot store 20! (2432902008176640000))
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}