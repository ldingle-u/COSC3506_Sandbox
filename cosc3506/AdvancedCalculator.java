package cosc3506;//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

	// FIXED: Added exception for 0 raised to negative exponent
	public double power(double base, int exponent) {
	    if (base == 0 && exponent < 0) {
	        throw new IllegalArgumentException("0 cannot have negative exponent");
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
        if (number <= 1) {
            return false;
        }
     // FIXED: Corrected loop condition to include sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
 // FIXED: Changed return type to long to prevent overflow
    public long factorial(int number) {
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
