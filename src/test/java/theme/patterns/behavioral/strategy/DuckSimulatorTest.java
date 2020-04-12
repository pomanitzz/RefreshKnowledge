package theme.patterns.behavioral.strategy;

import org.junit.Assert;
import org.junit.Test;
import theme.patterns.behavioral.strategy.domain.MallardDuck;
import theme.patterns.behavioral.strategy.domain.ModelDuck;

public class DuckSimulatorTest {

    @Test
    public void testMallardDuck() {
        var mallard = new MallardDuck();
        Assert.assertEquals("Quack", mallard.performQuack());
        Assert.assertEquals("Fly with wings!", mallard.performFly());
        Assert.assertEquals("Mallard Duck!", mallard.display());
        Assert.assertEquals("All ducks can swim!", mallard.swim());
    }

    @Test
    public void testModelDuck() {
        var modelDuck = new ModelDuck();
        Assert.assertEquals("Quack", modelDuck.performQuack());
        Assert.assertEquals("Can't fly!", modelDuck.performFly());
        Assert.assertEquals("Model Duck!", modelDuck.display());
        Assert.assertEquals("All ducks can swim!", modelDuck.swim());
    }
}
