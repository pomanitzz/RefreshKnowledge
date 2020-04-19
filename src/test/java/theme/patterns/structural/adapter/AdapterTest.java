package theme.patterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void testCar() {
        var car = new Car();
        var carSpeedAdapter = new SpeedCalculatorAdapter(car);
        Assert.assertEquals(100, carSpeedAdapter.calculateAbleAverageSpeed());
    }

    @Test
    public void testBus() {
        var bus = new Bus();
        var busSpeedAdapter = new SpeedCalculatorAdapter(bus);
        Assert.assertEquals(50, busSpeedAdapter.calculateAbleAverageSpeed());
    }
}
