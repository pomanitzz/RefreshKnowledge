package theme.patterns.decorator.coffee.secondary;

import theme.patterns.decorator.coffee.Beverage;
import theme.patterns.decorator.coffee.CondimentDecorator;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        double milkCost = 0.0;
        if (Size.TALL.equals(beverage.getSize())) {
            milkCost += 0.10;
        } else if (Size.GRANDE.equals(beverage.getSize())) {
            milkCost += 0.20;
        } else if (Size.VENTI.equals(beverage.getSize())) {
            milkCost += 0.30;
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", beverage.getSize()));
        }
        return milkCost + beverage.getCost();
    }
}
