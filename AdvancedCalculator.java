//COSC 3506 assignment4
//Student name: Jiayi Zhang
//Student number: 229644870
//IDE: eclipse

import java.math.BigInteger;

public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        if (exponent < 0) {
            if (base == 0) {
               // Throw exception for invalid input base=0
                throw new IllegalArgumentException("Zero base with negative exponent is not allowed.");
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
        //change the condition to <= from <
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        //int result = 1;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            //result *= i;
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}