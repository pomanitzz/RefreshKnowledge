package theme.patterns.creational.factory;

import theme.patterns.creational.factory.ingredient.Cheese;
import theme.patterns.creational.factory.ingredient.Clam;
import theme.patterns.creational.factory.ingredient.Dough;
import theme.patterns.creational.factory.ingredient.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clam createClam();
}
