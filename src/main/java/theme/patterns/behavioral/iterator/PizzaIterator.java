package theme.patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class PizzaIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    private int position;

    public PizzaIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        var item = menuItems.get(position);
        position++;
        return item;
    }
}
