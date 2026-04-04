//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        /**
         * I found one error while throwing the exception error like if the base is 0
         * and the exponent is negative, which would result in an undefined value
         * (division by zero).which is our third test case(0,-1)where the 0 is the base
         * and -1 is the exponent.
         * In this case, the method should throw an IllegalArgumentException to indicate
         * that this operation is not valid.
         * If this condition is met, an IllegalArgumentException is thrown with a
         * descriptive message.
         */
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Zero power negative number is undefined");
        }
        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        // Return a double, represents base raised to the exponent
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        /**
         * Here it properly checks the exception for negative numbers, which is our
         * second test case(-4) where the number is -4.
         * If the number is negative, an IllegalArgumentException is thrown with a
         * descriptive message.
         */
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {
        /**
         * I this method all the test cases are correct and the method is properly
         * checking if a number is prime or not, but I found one error in the loop
         * condition where it should be i <= Math.sqrt(number) instead of i <
         * Math.sqrt(number) because we need to check for divisibility up to and
         * including the square root of the number to ensure we correctly identify prime
         * numbers.
         * By taking the example of 4 which is not a prime number, if we only check up
         * to i < 2 (which is the square root of 4), we would miss the fact that 4 is
         * divisible by 2, and incorrectly identify it as a prime number. By changing
         * the condition to i <= Math.sqrt(number), will ensure that we check for
         * divisibility for all conditions.so i changed the conditon to i <=
         * Math.sqrt(number)
         */
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Loop condition changed to i <= Math.sqrt(number)
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public long factorial(int number) { 
        /**
         * change the return type to long to handle larger factorials as factorials grow very quickly and can exceed the range of int for relatively small inputs.As give in the test case example factorial(20) which is 2432902008176640000 which is far greater than the maximum value of int which is 2147483647
         */
        if (number < 0) {
            //Yes it is properly checking the exception for negative numbers, which is our third test case(-3) where the number is -3.
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
