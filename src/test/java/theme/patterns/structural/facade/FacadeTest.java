package theme.patterns.structural.facade;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacadeTest {

    private static SmartHouseController smartHouseController;

    @BeforeClass
    public static void before() {
        smartHouseController = new SmartHouseController(new Door(), new Light(), new TV());
    }

    @Test
    public void testStartWatchMovie() {
        Assert.assertEquals("Light off * TV on * Close door", smartHouseController.startWatchMovie());
    }

    @Test
    public void testStopWatchMovie() {
        Assert.assertEquals("Light on * TV off * Open door", smartHouseController.stopWatchMovie());
    }

}
