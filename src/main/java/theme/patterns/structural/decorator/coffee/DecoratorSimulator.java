package theme.patterns.structural.decorator.coffee;

import theme.patterns.structural.decorator.coffee.main.DarkRoast;
import theme.patterns.structural.decorator.coffee.main.Espresso;
import theme.patterns.structural.decorator.coffee.main.HouseBlend;
import theme.patterns.structural.decorator.coffee.secondary.Milk;
import theme.patterns.structural.decorator.coffee.secondary.Mocha;
import theme.patterns.structural.decorator.coffee.secondary.Soy;
import theme.patterns.structural.decorator.coffee.secondary.Whip;

public class DecoratorSimulator {

    public static final String OUTPUT_FORMAT = "%s $%.2f";

    public static void main(String[] args) {
        var espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);

        System.out.println(String.format(OUTPUT_FORMAT, espresso.getDescription(), espresso.getCost()));

        Beverage houseBlendWithDoubleMochaAndWhip = new HouseBlend();
        houseBlendWithDoubleMochaAndWhip = new Mocha(houseBlendWithDoubleMochaAndWhip);
        houseBlendWithDoubleMochaAndWhip = new Mocha(houseBlendWithDoubleMochaAndWhip);
        houseBlendWithDoubleMochaAndWhip = new Whip(houseBlendWithDoubleMochaAndWhip);

        System.out.println(String.format(OUTPUT_FORMAT, houseBlendWithDoubleMochaAndWhip.getDescription(), houseBlendWithDoubleMochaAndWhip.getCost()));

        Beverage darkRoastWithMilkAndSoy = new DarkRoast();
        darkRoastWithMilkAndSoy.setSize(Beverage.Size.GRANDE);
        darkRoastWithMilkAndSoy = new Milk(darkRoastWithMilkAndSoy);
        darkRoastWithMilkAndSoy = new Soy(darkRoastWithMilkAndSoy);

        System.out.println(String.format(OUTPUT_FORMAT, darkRoastWithMilkAndSoy.getDescription(), darkRoastWithMilkAndSoy.getCost()));
    }
}
