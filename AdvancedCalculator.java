// changes made for assignment by Bivek Chuwain

import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number and making sure proper error are thrown for special cases
    public double power(double base, int exponent) {
	if (base == 0 && exponent == 0) {
            throw new IllegalArgumentException("Undefine 0^0 is not possible to calculate "); }
        else if (exponent < 0) {
		if (base == 0) {
        		throw new IllegalArgumentException("Cannot calculate negative power to the 0");
        	}

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

    // Calculates factorial of a number and added biginteger for efficiency

    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        BigInteger result = BigInteger.ONE ;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}