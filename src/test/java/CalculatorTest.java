import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(20, 2);
    }

    @Test
    public void canAdd() {
        assertEquals(22, calculator.addNumbers(20, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(40, calculator.multiply(20, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(18, calculator.subtract(20, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(2.16, calculator.divide(2.6, 1.2), 0.01);
    }
}
