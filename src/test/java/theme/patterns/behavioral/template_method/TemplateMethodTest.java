package theme.patterns.behavioral.template_method;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void testTeaWithCondiments() {
        var tea = new Tea();
        Assert.assertEquals("BoilWater BrewTea PourInCup AddLemonAndSugar ", tea.prepare());
    }

    @Test
    public void testCoffeeWithCondiments() {
        var coffee = new Coffee(true);
        Assert.assertEquals("BoilWater BrewCoffee PourInCup AddMilkAndSugar ", coffee.prepare());
    }

    @Test
    public void testCoffeeWithoutCondiments() {
        var coffee = new Coffee(false);
        Assert.assertEquals("BoilWater BrewCoffee PourInCup ", coffee.prepare());
    }

}
