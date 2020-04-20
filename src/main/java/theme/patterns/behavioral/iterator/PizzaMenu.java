package theme.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PizzaMenu implements Iterable<MenuItem> {
    private final List<MenuItem> pizzas = new ArrayList<>();

    public PizzaMenu() {
        addMenuItem("cheese", "pizza with cheese", 3.45d);
        addMenuItem("chicken", "pizza with chicken", 2.95d);
        addMenuItem("clam", "pizza with clam", 4.45d);
    }

    public void addMenuItem(String name, String description, double price) {
        pizzas.add(new MenuItem(name, description, price));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new PizzaIterator(pizzas);
    }
}
