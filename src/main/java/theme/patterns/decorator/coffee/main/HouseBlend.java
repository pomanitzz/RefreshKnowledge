package theme.patterns.decorator.coffee.main;

import theme.patterns.decorator.coffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double getCost() {
        if (Size.TALL.equals(getSize())) {
            return 0.89;
        } else if (Size.GRANDE.equals(getSize())) {
            return 0.99;
        } else if (Size.VENTI.equals(getSize())) {
            return 1.09;
        }
        throw new UnsupportedOperationException(String.format("Unsupported size exception: %s", getSize()));
    }
}
