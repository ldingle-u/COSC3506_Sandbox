//Calculator that calculates factorial, exponents and checks if a number is prime
public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        //Error #1 added this in to catch 0 base and negative exponents, as the test failed with 0, -1
        if (exponent< 0 && base==0){
           throw new ArithmeticException("you can't have a zero as a base and a negative exponent ");
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
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates factorial of a number, however since it was initially an int could only calc
    //factorial numbers that don't push it above the int overflow
    //Error #2 Changed the return to long to allow for reasonable factorials
    // and changed the type of result from int to long
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        //changed this to long also
        long result = 1;

        // Iteratively calculates factorial in an ascending fashion
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
