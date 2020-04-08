package theme.patterns.decorator.coffee.secondary;

import theme.patterns.decorator.coffee.Beverage;
import theme.patterns.decorator.coffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        double mochaCost = 0.0;
        if (Size.TALL.equals(beverage.getSize())) {
            mochaCost += 0.20;
        } else if (Size.GRANDE.equals(beverage.getSize())) {
            mochaCost += 0.30;
        } else if (Size.VENTI.equals(beverage.getSize())) {
            mochaCost += 0.40;
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", beverage.getSize()));
        }
        return mochaCost + beverage.getCost();
    }
}
