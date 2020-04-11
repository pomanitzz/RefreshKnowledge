package theme.patterns.structural.decorator.coffee;


import org.junit.Assert;
import org.junit.Test;
import theme.patterns.structural.decorator.coffee.main.DarkRoast;
import theme.patterns.structural.decorator.coffee.main.Decaf;
import theme.patterns.structural.decorator.coffee.main.Espresso;
import theme.patterns.structural.decorator.coffee.main.HouseBlend;
import theme.patterns.structural.decorator.coffee.secondary.Milk;
import theme.patterns.structural.decorator.coffee.secondary.Mocha;
import theme.patterns.structural.decorator.coffee.secondary.Soy;
import theme.patterns.structural.decorator.coffee.secondary.Whip;

public class DecoratorSimulatorTest {

    public static final double MAX_DELTA = 0.0001;

    @Test
    public void testEspressoVenti() {
        var espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        Assert.assertEquals(2.19, espresso.getCost(), MAX_DELTA);

    }
    @Test
    public void testEspressoTallWithMilk() {
        Beverage espressoMilk = new Espresso();
        espressoMilk.setSize(Beverage.Size.TALL);
        espressoMilk = new Milk(espressoMilk);
        Assert.assertEquals(2.09, espressoMilk.getCost(), MAX_DELTA);
        Assert.assertEquals("Espresso, Milk", espressoMilk.getDescription());
    }

    @Test
    public void testDecafGrandeWithWhip() {
        Beverage decafGrandeWhip = new Decaf();
        decafGrandeWhip.setSize(Beverage.Size.GRANDE);
        decafGrandeWhip = new Whip(decafGrandeWhip);
        Assert.assertEquals(1.45, decafGrandeWhip.getCost(), MAX_DELTA);
    }

    @Test
    public void testHouseBlendVentiWithWhipAndSoy() {
        Beverage houseBlendVentiWhipAndSoy = new HouseBlend();
        houseBlendVentiWhipAndSoy.setSize(Beverage.Size.VENTI);
        houseBlendVentiWhipAndSoy = new Whip(houseBlendVentiWhipAndSoy);
        houseBlendVentiWhipAndSoy = new Soy(houseBlendVentiWhipAndSoy);
        Assert.assertEquals(1.74, houseBlendVentiWhipAndSoy.getCost(), MAX_DELTA);
        Assert.assertEquals("HouseBlend, Whip, Soy", houseBlendVentiWhipAndSoy.getDescription());
    }

    @Test
    public void testHouseBlendWithDoubleMochaAndWhip() {
        Beverage houseBlendDoubleMochaAndWhip = new HouseBlend();
        houseBlendDoubleMochaAndWhip = new Mocha(houseBlendDoubleMochaAndWhip);
        houseBlendDoubleMochaAndWhip = new Mocha(houseBlendDoubleMochaAndWhip);
        houseBlendDoubleMochaAndWhip = new Whip(houseBlendDoubleMochaAndWhip);
        Assert.assertEquals(1.39, houseBlendDoubleMochaAndWhip.getCost(), MAX_DELTA);
    }

    @Test
    public void testDarkRoastWithMilkAndSoy() {
        Beverage darkRoastMilkAndSoy = new DarkRoast();
        darkRoastMilkAndSoy.setSize(Beverage.Size.GRANDE);
        darkRoastMilkAndSoy = new Milk(darkRoastMilkAndSoy);
        darkRoastMilkAndSoy = new Soy(darkRoastMilkAndSoy);

       Assert.assertEquals(1.54, darkRoastMilkAndSoy.getCost(), MAX_DELTA);
    }

    @Test
    public void testDarkRoastVentiWithDoubleMocha() {
        Beverage darkRoastDoubleMocha = new DarkRoast();
        darkRoastDoubleMocha.setSize(Beverage.Size.VENTI);
        darkRoastDoubleMocha = new Mocha(darkRoastDoubleMocha);
        darkRoastDoubleMocha = new Mocha(darkRoastDoubleMocha);

       Assert.assertEquals(1.99, darkRoastDoubleMocha.getCost(), MAX_DELTA);
       Assert.assertEquals("DarkRoast, Mocha, Mocha", darkRoastDoubleMocha.getDescription());
    }

    @Test
    public void testDecafVentiWithMilk() {
        Beverage decafVentiMilk = new Decaf();
        decafVentiMilk.setSize(Beverage.Size.VENTI);
        decafVentiMilk = new Milk(decafVentiMilk);

       Assert.assertEquals(1.65, decafVentiMilk.getCost(), MAX_DELTA);
       Assert.assertEquals("Decaf, Milk", decafVentiMilk.getDescription());
    }
}
