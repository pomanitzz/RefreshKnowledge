package theme.patterns.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void testSmallCircleBridge() {
        var circle = new Circle(new SmallCircleDrawer(), 1, 2, 3);
        Assert.assertEquals("small 1 2 3", circle.draw());
    }

    @Test
    public void testLargeCircleBridge() {
        var circle = new Circle(new LargeCircleDrawer(), 3, 4, 5);
        Assert.assertEquals("large 3 4 5", circle.draw());
    }
}
