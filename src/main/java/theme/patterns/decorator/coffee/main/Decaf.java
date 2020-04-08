package theme.patterns.decorator.coffee.main;

import theme.patterns.decorator.coffee.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double getCost() {
        if (Size.TALL.equals(getSize())) {
            return 1.15;
        } else if (Size.GRANDE.equals(getSize())) {
            return 1.25;
        } else if (Size.VENTI.equals(getSize())) {
            return 1.35;
        }
        throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", getSize()));
    }
}
