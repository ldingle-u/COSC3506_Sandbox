package defaultt;
public class AdvancedCalculator {

    public double power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("0 cannot have negative exponent");
        }

        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }

        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
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

    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative factorial");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}