package theme.patterns.behavioral.template_method;

public class Tea extends CaffeineBeverage {
    @Override
    public String brew() {
        return "BrewTea ";
    }

    @Override
    public String addCondiments() {
        return "AddLemonAndSugar ";
    }
}
