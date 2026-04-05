/**
  AdvancedCalculator - Fixed Version
  
  Issues found and fixed:
  1. isPrime() method: loop condition was i < Math.sqrt(number) 
     - Fixed to i <= Math.sqrt(number) to properly check square root values
     - Example: 9 was incorrectly identified as prime, now correctly identified as composite
  
  2. factorial() method: return type was int causing overflow for values > 12!
     - Changed return type from int to long to handle larger values up to 20!
     - 20! = 2,432,902,008,176,640,000 now fits in long
  
  3. power() method: missing exception for 0^negative
     - Added check for base == 0 && exponent < 0 throwing ArithmeticException
    - This handles the edge case required by the assignment
 */
//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        // FIX: Check for 0^negative (undefined/infinite)
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Cannot raise 0 to a negative exponent");
        }
        
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        // Return a double, represents base raised to the exponent
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
        // FIX: Changed < to <= to check the square root itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    // FIX: Changed return type from int to long to handle larger values
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        long result = 1;
        // Iteratively calculates factorial in an ascending fashion
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
