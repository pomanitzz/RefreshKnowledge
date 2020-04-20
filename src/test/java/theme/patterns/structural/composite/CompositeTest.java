package theme.patterns.structural.composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void testGraphic() {
        var graphicWithoutCorners = new CompositeGraphic();
        graphicWithoutCorners.add(new Ellipse());

        var graphicWithCorners = new CompositeGraphic();
        graphicWithCorners.add(() -> "Square");
        graphicWithCorners.add(() -> "Rectangle");

        var commonGraphic = new CompositeGraphic();
        commonGraphic.add(graphicWithoutCorners);
        commonGraphic.add(graphicWithCorners);

        Assert.assertEquals("Ellipse  Square Rectangle  ", commonGraphic.getName());
    }
}
