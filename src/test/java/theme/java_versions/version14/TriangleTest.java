package theme.java_versions.version14;

import org.junit.Assert;
import org.junit.Test;
import theme.java_versions.version14.record.Triangle;

public class TriangleTest {
    @Test
    public void testTriangleRecord() {
        var triangle = new Triangle(3, 6, 9);
        Assert.assertEquals(18, triangle.x() + triangle.y() + triangle.z());
    }
}
