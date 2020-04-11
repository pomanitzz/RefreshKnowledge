package theme.patterns.creational.factory;

import theme.patterns.creational.factory.ingredient.Cheese;
import theme.patterns.creational.factory.ingredient.Clam;
import theme.patterns.creational.factory.ingredient.Dough;
import theme.patterns.creational.factory.ingredient.Sauce;

public class Pizza {
    private String name;
    private Sauce sauce;
    private Dough dough;
    private Cheese cheese;
    private Clam clam;

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = name;
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        dough = getPizzaIngredientFactory().createDough();
        sauce = getPizzaIngredientFactory().createSauce();
        cheese = getPizzaIngredientFactory().createCheese();
        clam = getPizzaIngredientFactory().createClam();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Clam getClam() {
        return clam;
    }

    public void setClam(Clam clam) {
        this.clam = clam;
    }

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }
}
