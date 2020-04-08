package theme.patterns.decorator.coffee.main;

import theme.patterns.decorator.coffee.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double getCost() {
        if (Size.TALL.equals(getSize())) {
            return 1.99;
        } else if (Size.GRANDE.equals(getSize())) {
            return 2.09;
        } else if (Size.VENTI.equals(getSize())) {
            return 2.19;
        }
        throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", getSize()));
    }
}
