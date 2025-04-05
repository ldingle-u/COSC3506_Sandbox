public class AdvancedCalculator {

	public static double power(double base, int exponent) {
	    // Check if the base is 0 and exponent is negative
	    if (base == 0 && exponent < 0) {
	        throw new IllegalArgumentException("0 to negative power is undefined");
	    }
	    return Math.pow(base, exponent);  // Use Math.pow to calculate the power
	}


    public static double squareRoot(double num) {
        if (num < 0)
            throw new IllegalArgumentException("Cannot take square root of negative number.");
        return Math.sqrt(num);
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}