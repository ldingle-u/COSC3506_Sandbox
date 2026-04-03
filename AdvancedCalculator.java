//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {

        /*
        Issue found: 0^-1 had a result of infinity

        Now when the base is 0 and the exponent is less than 0, the program
        trows and exception
        */

        if (base == 0 && exponent <0)
        {
            throw new IllegalArgumentException("Infinity");
        }
        else if (exponent < 0) {
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
        /*
        Issue found: Numbers that aren't divisible by 2 return the wrong answer

        The = sign was missing in the i <= Math.sqrt(number) statement

        Tricky...
         */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        /*
        Issue found: Numbers greater than 12 exceed the capacity of an int

        Now when the input number is greater than 12, it throws an exception
         */
        else if (number > 12)
        {
            throw new IllegalArgumentException("Factorial is too big for an int type");
        }
        int result = 1;
        // Iteratively calculates factorial in an ascending fashion
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
