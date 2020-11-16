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

    @Test
    public void canClearVolume() {
        waterBottle.clearVolume();
        assertEquals(0, waterBottle.volume);
    }

    @Test
    public void canFillVolume() {
        WaterBottle waterBottle = new WaterBottle(10);
        waterBottle.fillVolume();
        assertEquals(100, waterBottle.getVolume());
    }
}
