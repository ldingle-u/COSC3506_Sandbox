package tests;

public class AdvancedCalculator {
	
	// Calculates the power of a number
    public double power(double base, int exponent) {
    	
    	//Fix : Added check for division by zero when base is 0 and exponent is negative
    	if(base == 0 && exponent < 0) {
    		
    		throw new ArithmeticException("Can't raise 0 to a negative exponent");
    	}
    	
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
    	
    	//FIX : Throw an exception if the number is negative.
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
    //Fix: Loop should go up to math.sqrt(number) inclusive to correctly check for prime numbers
    //We use i <=Math.sqrt(number)' to check up to the square root because no factors are larger than this   
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public long factorial(int number) {
    	
    	//FIX: Factorial is not defined for negative numbers, so we throw an exception for them
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        //Fix: Changed to long to handle larger factorials (like 20! and beyond)
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
