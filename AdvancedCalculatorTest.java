import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AdvancedCalculatorTest
{
    @Test
    public void powerTest()
    {
        AdvancedCalculator calculator = new AdvancedCalculator();

        double result = calculator.power(2, 3);
        assertEquals(8, result);

        double result2 = calculator.power(2, -3);
        double division = 1.0/8.0;
        assertEquals(division, result2);

        double result3 = calculator.power(0, -1);
        assertEquals(0, result3);


    }


}