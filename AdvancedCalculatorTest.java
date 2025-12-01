/**
 * Test class for AdvancedCalculator
 * Uses built-in Java assertions for testing
 */
public class AdvancedCalculatorTest {

    private static int testsPassed = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("=== AdvancedCalculator Test Suite ===\n");
        
        // Run all test methods
        testPowerPositive();
        testPowerNegativeExponent();
        testPowerZeroNegative();
        testSquareRootPositive();
        testSquareRootNegative();
        testIsPrime();
        testFactorialPositive();
        testFactorialZero();
        testFactorialNegative();
        testFactorialLarge();
        
        // Print summary
        System.out.println("\n=== Test Summary ===");
        System.out.println("Total Tests: " + (testsPassed + testsFailed));
        System.out.println("Passed: " + testsPassed);
        System.out.println("Failed: " + testsFailed);
        
        if (testsFailed == 0) {
            System.out.println("\nAll tests passed! ✓");
            System.exit(0);
        } else {
            System.out.println("\nSome tests failed! ✗");
            System.exit(1);
        }
    }

    // Power tests
    private static void testPowerPositive() {
        try {
            double result = AdvancedCalculator.power(2, 3);
            assert result == 8 : "Expected 8, got " + result;
            System.out.println("✓ testPowerPositive - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testPowerPositive - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    private static void testPowerNegativeExponent() {
        try {
            double result = AdvancedCalculator.power(2, -3);
            assert Math.abs(result - 0.125) < 0.0001 : "Expected 0.125, got " + result;
            System.out.println("✓ testPowerNegativeExponent - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testPowerNegativeExponent - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    private static void testPowerZeroNegative() {
        try {
            AdvancedCalculator.power(0, -1);
            System.out.println("✗ testPowerZeroNegative - FAILED: Expected ArithmeticException not thrown");
            testsFailed++;
        } catch (ArithmeticException e) {
            System.out.println("✓ testPowerZeroNegative - PASSED");
            testsPassed++;
        }
    }

    // Square root tests
    private static void testSquareRootPositive() {
        try {
            double result = AdvancedCalculator.squareRoot(9);
            assert Math.abs(result - 3) < 0.0001 : "Expected 3, got " + result;
            System.out.println("✓ testSquareRootPositive - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testSquareRootPositive - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    private static void testSquareRootNegative() {
        try {
            AdvancedCalculator.squareRoot(-4);
            System.out.println("✗ testSquareRootNegative - FAILED: Expected IllegalArgumentException not thrown");
            testsFailed++;
        } catch (IllegalArgumentException e) {
            System.out.println("✓ testSquareRootNegative - PASSED");
            testsPassed++;
        }
    }

    // Prime number tests
    private static void testIsPrime() {
        try {
            assert AdvancedCalculator.isPrime(13) : "isPrime(13) should be true";
            assert !AdvancedCalculator.isPrime(10) : "isPrime(10) should be false";
            assert AdvancedCalculator.isPrime(29) : "isPrime(29) should be true";
            assert !AdvancedCalculator.isPrime(1) : "isPrime(1) should be false";
            System.out.println("✓ testIsPrime - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testIsPrime - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    // Factorial tests
    private static void testFactorialPositive() {
        try {
            long result = AdvancedCalculator.factorial(5);
            assert result == 120 : "Expected 120, got " + result;
            System.out.println("✓ testFactorialPositive - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testFactorialPositive - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    private static void testFactorialZero() {
        try {
            long result = AdvancedCalculator.factorial(0);
            assert result == 1 : "Expected 1, got " + result;
            System.out.println("✓ testFactorialZero - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testFactorialZero - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }

    private static void testFactorialNegative() {
        try {
            AdvancedCalculator.factorial(-3);
            System.out.println("✗ testFactorialNegative - FAILED: Expected IllegalArgumentException not thrown");
            testsFailed++;
        } catch (IllegalArgumentException e) {
            System.out.println("✓ testFactorialNegative - PASSED");
            testsPassed++;
        }
    }

    private static void testFactorialLarge() {
        try {
            long result = AdvancedCalculator.factorial(20);
            assert result == 2432902008176640000L : "Expected 2432902008176640000, got " + result;
            System.out.println("✓ testFactorialLarge - PASSED");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("✗ testFactorialLarge - FAILED: " + e.getMessage());
            testsFailed++;
        }
    }
}
