import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canRemoveDrink() {
        waterBottle.removeDrink(10);
        assertEquals(90, waterBottle.getVolume());
    }
}
