package theme.patterns.creational.factory;

public class ChicagoPizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza() {
        return new Pizza("Chicago", new ChicagoPizzaIngredientFactory());
    }
}
