package theme.patterns.behavioral.iterator;

import java.util.Iterator;

public class PancakeIterator implements Iterator<MenuItem> {

    private final MenuItem[] menuItems;
    private int position;

    public PancakeIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.length || menuItems[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[position];
        position++;
        return item;
    }
}
