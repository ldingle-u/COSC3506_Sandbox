public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {
        try { 
            if (exponent < 0) {
                // Created a case to handle Arithmetic Expection Handling
                if (base==0){
                    throw new ArithmeticException("Cannot divide by Zero...");
                }
                return 1 / Math.pow(base, -exponent);
            }
            return Math.pow(base, exponent);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        try{
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(number);
        } catch (Exception e){
            System.err.println(e.getMessage());
            return 0;
        }
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

    // Calculates factorial of a number
    public long factorial(int number) {
        try{
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is undefined for negative numbers");
            }
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        } catch(Exception e){
            System.err.println(e.getMessage());
            return 0;
        }
    }
}