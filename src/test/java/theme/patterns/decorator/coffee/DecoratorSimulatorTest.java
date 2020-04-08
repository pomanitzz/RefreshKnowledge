package theme.patterns.decorator.coffee;


import org.junit.Assert;
import org.junit.Test;
import theme.patterns.decorator.coffee.main.DarkRoast;
import theme.patterns.decorator.coffee.main.Decaf;
import theme.patterns.decorator.coffee.main.Espresso;
import theme.patterns.decorator.coffee.main.HouseBlend;
import theme.patterns.decorator.coffee.secondary.Milk;
import theme.patterns.decorator.coffee.secondary.Mocha;
import theme.patterns.decorator.coffee.secondary.Soy;
import theme.patterns.decorator.coffee.secondary.Whip;

public class DecoratorSimulatorTest {

    public static final double MAX_DELTA = 0.0001;

    @Test
    public void testEspressoVenti() {
        var espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        Assert.assertEquals(2.19, espresso.getCost(), MAX_DELTA);
    }

    @Test
    public void testDecafGrandeWithWhip() {
        Beverage decafGrandeWithWhip = new Decaf();
        decafGrandeWithWhip.setSize(Beverage.Size.GRANDE);
        decafGrandeWithWhip = new Whip(decafGrandeWithWhip);
        Assert.assertEquals(1.45, decafGrandeWithWhip.getCost(), MAX_DELTA);
    }

    @Test
    public void testHouseBlendWithDoubleMochaAndWhip() {
        Beverage houseBlendWithDoubleMochaAndWhip = new HouseBlend();
        houseBlendWithDoubleMochaAndWhip = new Mocha(houseBlendWithDoubleMochaAndWhip);
        houseBlendWithDoubleMochaAndWhip = new Mocha(houseBlendWithDoubleMochaAndWhip);
        houseBlendWithDoubleMochaAndWhip = new Whip(houseBlendWithDoubleMochaAndWhip);
        Assert.assertEquals(1.39, houseBlendWithDoubleMochaAndWhip.getCost(), MAX_DELTA);
    }

    @Test
    public void testDarkRoastWithMilkAndSoy() {
        Beverage darkRoastWithMilkAndSoy = new DarkRoast();
        darkRoastWithMilkAndSoy.setSize(Beverage.Size.GRANDE);
        darkRoastWithMilkAndSoy = new Milk(darkRoastWithMilkAndSoy);
        darkRoastWithMilkAndSoy = new Soy(darkRoastWithMilkAndSoy);

       Assert.assertEquals(1.54, darkRoastWithMilkAndSoy.getCost(), MAX_DELTA);
    }
}
