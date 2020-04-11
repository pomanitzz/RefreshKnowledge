package theme.patterns.creational.factory;


import theme.patterns.creational.factory.ingredient.Cheese;
import theme.patterns.creational.factory.ingredient.Clam;
import theme.patterns.creational.factory.ingredient.Dough;
import theme.patterns.creational.factory.ingredient.FrozenClam;
import theme.patterns.creational.factory.ingredient.MozzarellaCheese;
import theme.patterns.creational.factory.ingredient.PlumTomatoSauce;
import theme.patterns.creational.factory.ingredient.Sauce;
import theme.patterns.creational.factory.ingredient.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
