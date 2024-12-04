
public class AdvanceCalculatorUnitTest {
	 private final AdvancedCalculator calculator = new AdvancedCalculator();

	    // Test for the power method
	    public void testPower() {
	        System.out.println("=== Running testPower() ===");

	        // Positive exponent
	        double result = calculator.power(2, 3);
	        System.out.println(result == 8 ? "PASS: 2^3 = 8" : "FAIL: 2^3 = " + result);

	        // Negative exponent
	        result = calculator.power(2, -3);
	        System.out.println(Math.abs(result - 0.125) < 0.0001 ? "PASS: 2^-3 = 0.125" : "FAIL: 2^-3 = " + result);

	        // Zero base with negative exponent
	        try {
	            calculator.power(0, -1);
	            System.out.println("FAIL: Expected ArithmeticException for 0^-1");
	        } catch (ArithmeticException e) {
	            System.out.println("PASS: Caught expected ArithmeticException for 0^-1");
	        }
	    }

	    // Test for the squareRoot method
	    public void testSquareRoot() {
	        System.out.println("=== Running testSquareRoot() ===");

	        // Positive number
	        double result = calculator.squareRoot(9);
	        System.out.println(result == 3 ? "PASS: sqrt(9) = 3" : "FAIL: sqrt(9) = " + result);

	        // Negative number
	        try {
	            calculator.squareRoot(-4);
	            System.out.println("FAIL: Expected IllegalArgumentException for sqrt(-4)");
	        } catch (IllegalArgumentException e) {
	            System.out.println("PASS: Caught expected IllegalArgumentException for sqrt(-4)");
	        }
	    }

	    // Test for the isPrime method
	    public void testIsPrime() {
	        System.out.println("=== Running testIsPrime() ===");

	        // Prime number
	        System.out.println(calculator.isPrime(13) ? "PASS: 13 is prime" : "FAIL: 13 is prime");

	        // Non-prime number
	        System.out.println(!calculator.isPrime(10) ? "PASS: 10 is not prime" : "FAIL: 10 is not prime");

	        // Edge cases
	        System.out.println(calculator.isPrime(29) ? "PASS: 29 is prime" : "FAIL: 29 is prime");
	        System.out.println(!calculator.isPrime(1) ? "PASS: 1 is not prime" : "FAIL: 1 is not prime");
	    }

	    // Test for the factorial method
	    public void testFactorial() {
	        System.out.println("=== Running testFactorial() ===");

	        // Small number
	        double result = calculator.factorial(5);
	        System.out.println(result == 120 ? "PASS: 5! = 120" : "FAIL: 5! = " + result);

	        // Zero factorial
	        result = calculator.factorial(0);
	        System.out.println(result == 1 ? "PASS: 0! = 1" : "FAIL: 0! = " + result);

	        // Negative number
	        try {
	            calculator.factorial(-3);
	            System.out.println("FAIL: Expected IllegalArgumentException for factorial(-3)");
	        } catch (IllegalArgumentException e) {
	            System.out.println("PASS: Caught expected IllegalArgumentException for factorial(-3)");
	        }

	        // Large number
	        try {
	            result = calculator.factorial(20);
	            System.out.println(result > 0 ? "PASS: 20! calculated successfully" : "FAIL: 20! = " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("FAIL: Overflow error calculating 20!.");
	        }
	    }

	    // Main method to run all tests
	    public static void main(String[] args) {
	        AdvanceCalculatorUnitTest tester = new AdvanceCalculatorUnitTest();
	        tester.testPower();
	        tester.testSquareRoot();
	        tester.testIsPrime();
	        tester.testFactorial();
	    }
}
