
package com.calculator;

public class AdvancedCalculator {

    public double power(double base, double exponent) {
      
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Invalid input: 0 cannot be raised to a negative power.");
        }
        return Math.pow(base, exponent); 
    }

    public double squareRoot(double number) {
      
        if (number < 0) {
            throw new IllegalArgumentException("Invalid input: Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public boolean isPrime(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;
        
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public long factorial(int n) { 
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input: Factorial is only defined for non-negative numbers.");
        }
        
        if (n == 0) {
            return 1;
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}