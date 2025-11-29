package testCase;

public class AdvanceCalculator {
    public double power(double base, int exponent) {
        if (base == 0 && exponent < 0)
            throw new ArithmeticException("Cannot raise 0 to a negative power.");
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        if (num < 0)
            throw new IllegalArgumentException("Cannot take square root of negative number.");
        return Math.sqrt(num);
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
