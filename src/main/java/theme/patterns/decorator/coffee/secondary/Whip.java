package theme.patterns.decorator.coffee.secondary;

import theme.patterns.decorator.coffee.Beverage;
import theme.patterns.decorator.coffee.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        double whipCost = 0.0;
        if (Size.TALL.equals(beverage.getSize())) {
            whipCost += 0.10;
        } else if (Size.GRANDE.equals(beverage.getSize())) {
            whipCost += 0.20;
        } else if (Size.VENTI.equals(beverage.getSize())) {
            whipCost += 0.30;
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", beverage.getSize()));
        }
        return whipCost + beverage.getCost();
    }
}
