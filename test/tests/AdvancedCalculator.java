package tests;
	
public class AdvancedCalculator {

    public double power(double base, double exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Cannot raise 0 to a negative power.");
        }
        return Math.pow(base, exponent);
    }

    public double squareRoot(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(value);
    }

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

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
