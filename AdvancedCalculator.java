public class AdvancedCalculator {

    // POWER METHOD
    public double power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("0 cannot have negative exponent");
        }
        return Math.pow(base, exponent);
    }

    // SQUARE ROOT METHOD
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return Math.sqrt(num);
    }

    // PRIME CHECK METHOD
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // FACTORIAL METHOD
    public long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
