package theme.patterns.structural.decorator.coffee.main;

import theme.patterns.structural.decorator.coffee.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("DarkRoast");
    }

    @Override
    public double getCost() {
        if (Size.TALL.equals(getSize())) {
            return 0.99;
        } else if (Size.GRANDE.equals(getSize())) {
            return 1.09;
        } else if (Size.VENTI.equals(getSize())) {
            return 1.19;
        }
        throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", getSize()));
    }
}
