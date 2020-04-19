package theme.patterns.behavioral.template_method;

public class Coffee extends CaffeineBeverage {
    private boolean wannaCondiments;

    public Coffee(boolean wannaCondiments) {
        this.wannaCondiments = wannaCondiments;
    }

    @Override
    public String brew() {
        return "BrewCoffee ";
    }

    @Override
    public String addCondiments() {
        return "AddMilkAndSugar ";
    }

    @Override
    public boolean wannaCondiments() {
        return wannaCondiments;
    }
}
