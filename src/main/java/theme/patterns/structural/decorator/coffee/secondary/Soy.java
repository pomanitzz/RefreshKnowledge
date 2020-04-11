package theme.patterns.structural.decorator.coffee.secondary;

import theme.patterns.structural.decorator.coffee.Beverage;
import theme.patterns.structural.decorator.coffee.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        double soyCost = 0.0;
        if (Size.TALL.equals(beverage.getSize())) {
            soyCost += 0.15;
        } else if (Size.GRANDE.equals(beverage.getSize())) {
            soyCost += 0.25;
        } else if (Size.VENTI.equals(beverage.getSize())) {
            soyCost += 0.35;
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", beverage.getSize()));
        }
        return soyCost + beverage.getCost();
    }
}
