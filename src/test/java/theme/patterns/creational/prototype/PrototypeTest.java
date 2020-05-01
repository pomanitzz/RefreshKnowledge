package theme.patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void testPrototype() {
        ShapeCache.loadCache();
        var circle = ShapeCache.getShape("1");
        Assert.assertEquals("Circle", circle.draw());

        var rectangle = ShapeCache.getShape("2");
        Assert.assertEquals("Rectangle", rectangle.draw());
    }

}

