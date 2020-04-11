package theme.patterns.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class PizzaSimulator {

    @Test
    public void testChicagoPizza() {
        var chicagoStore = new ChicagoPizzaStore();
        var chicagoPizza = chicagoStore.createPizza();
        chicagoPizza.prepare();
        Assert.assertEquals("Chicago", chicagoPizza.getName());
        Assert.assertEquals("ThickCrustDough", chicagoPizza.getDough().getDescription());
        Assert.assertEquals("MozzarellaCheese", chicagoPizza.getCheese().getDescription());
        Assert.assertEquals("FrozenClam", chicagoPizza.getClam().getDescription());
        Assert.assertEquals("PlumTomatoSauce", chicagoPizza.getSauce().getDescription());
    }

    @Test
    public void testNYPizza() {
        var nyStore = new NYPizzaStore();
        var nyPizza = nyStore.createPizza();
        nyPizza.prepare();
        Assert.assertEquals("NY", nyPizza.getName());
        Assert.assertEquals("ThinCrustDough", nyPizza.getDough().getDescription());
        Assert.assertEquals("ReggianoCheese", nyPizza.getCheese().getDescription());
        Assert.assertEquals("FreshClam", nyPizza.getClam().getDescription());
        Assert.assertEquals("MarinaraSauce", nyPizza.getSauce().getDescription());
    }

}
