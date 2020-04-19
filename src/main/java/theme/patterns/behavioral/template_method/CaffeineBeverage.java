package theme.patterns.behavioral.template_method;

public abstract class CaffeineBeverage {
    public final String prepare() {
        String result = boilWater();
        result += brew();
        result += pourInCup();
        if (wannaCondiments()) {
            result += addCondiments();
        }
        return result;
    }

    public String boilWater() {
        return "BoilWater ";
    }

    public abstract String brew();

    public String pourInCup() {
        return "PourInCup ";
    }

    public boolean wannaCondiments() {
        return true;
    }

    public abstract String addCondiments();
}
