package theme.patterns.creational.factory;

public class NYPizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza() {
        return new Pizza("NY", new NYPizzaIngredientFactory());
    }
}
