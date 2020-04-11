package theme.patterns.creational.factory;


import theme.patterns.creational.factory.ingredient.Cheese;
import theme.patterns.creational.factory.ingredient.Clam;
import theme.patterns.creational.factory.ingredient.Dough;
import theme.patterns.creational.factory.ingredient.FreshClam;
import theme.patterns.creational.factory.ingredient.MarinaraSauce;
import theme.patterns.creational.factory.ingredient.ReggianoCheese;
import theme.patterns.creational.factory.ingredient.Sauce;
import theme.patterns.creational.factory.ingredient.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
