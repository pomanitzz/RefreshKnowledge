package theme.patterns.behavioral.iterator;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    public static final double MAX_DELTA = 0.0001;

    @Test
    public void testPancakeIterator() {
        var pancakeMenu = new PancakeMenu();
        var totalExpectedNames = "jam pancake   meat pancake   sour cream pancake   ";
        var totalExpectedAmount = 2.45d + 2.75d + 1.85d;

        StringBuilder actualNames = new StringBuilder();
        var actualTotalAmount = 0.0d;

        var pancakeIterator = pancakeMenu.iterator();

        while (pancakeIterator.hasNext()) {
            var pancakeItem = pancakeIterator.next();
            actualNames.append(pancakeItem.getName()).append("   ");
            actualTotalAmount += pancakeItem.getPrice();
        }

        Assert.assertEquals(totalExpectedNames, actualNames.toString());
        Assert.assertEquals(totalExpectedAmount, actualTotalAmount, MAX_DELTA);
    }

    @Test
    public void testPizzaIterator() {
        var pizzaMenu = new PizzaMenu();
        var totalExpectedNames = "cheese   chicken   clam   ";
        var totalExpectedAmount = 3.45d + 2.95d + 4.45d;

        StringBuilder actualNames = new StringBuilder();
        var actualTotalAmount = 0.0d;

        var pizzaIterator = pizzaMenu.iterator();

        while (pizzaIterator.hasNext()) {
            var pizzaItem = pizzaIterator.next();
            actualNames.append(pizzaItem.getName()).append("   ");
            actualTotalAmount += pizzaItem.getPrice();
        }

        Assert.assertEquals(totalExpectedNames, actualNames.toString());
        Assert.assertEquals(totalExpectedAmount, actualTotalAmount, MAX_DELTA);
    }


}
