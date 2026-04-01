import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test (expected = IllegalArgumentException.class)
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
}
