import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAdvancedCalculator {
    
    @Test
    public void testPower1() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double testPower1 = advancedCalculator.power(2, 3);
        assertEquals(8.0, testPower1, 0.001);
    }

    @Test
    public void testPower2() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double testPower2 = advancedCalculator.power(2, -3);
        assertEquals(0.125, testPower2, 0);
    }

    @Test (expected = ArithmeticException.class)
    public void testPower3() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.power(0, -1);
    }

    @Test
    public void testSquareRoot1() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double testSquareRoot1 = advancedCalculator.squareRoot(9);
        assertEquals(3.0, testSquareRoot1, 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSquareRoot2() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.squareRoot(-4);
    }

    @Test
    public void testIsPrime1() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        boolean testIsPrime1 = advancedCalculator.isPrime(13);
        assertTrue(testIsPrime1);
    }

    @Test
    public void testIsPrime2() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        boolean testIsPrime1 = advancedCalculator.isPrime(10);
        assertFalse(testIsPrime1);
    }

    @Test
    public void testIsPrime3() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        boolean testIsPrime1 = advancedCalculator.isPrime(29);
        assertTrue(testIsPrime1);
    }

    @Test
    public void testIsPrime4() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        boolean testIsPrime1 = advancedCalculator.isPrime(1);
        assertFalse(testIsPrime1);
    }

    @Test
    public void testFactorial1() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int testFactorial1 = advancedCalculator.factorial(5);
        assertEquals(120, testFactorial1, 0.001);
    }

    @Test
    public void testFactorial2() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int testFactorial2 = advancedCalculator.factorial(0);
        assertEquals(1, testFactorial2, 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFactorial3() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.factorial(-3);
    }

    @Test (expected = ArithmeticException.class)
    public void testFactorial4() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.factorial(20);
    }

}
