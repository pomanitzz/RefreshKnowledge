package theme.patterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void testFlyweight() {
        Shape redCircle = ShapeFactory.getCircle("red");
        int circleHashCode = redCircle.hashCode();
        Assert.assertEquals(circleHashCode, ShapeFactory.getCircle("red").hashCode());
    }
}
