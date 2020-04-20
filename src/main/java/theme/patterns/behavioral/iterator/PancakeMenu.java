package theme.patterns.behavioral.iterator;

import java.util.Iterator;

public class PancakeMenu implements Iterable<MenuItem> {
    private final MenuItem[] pancakes = new MenuItem[3];

    public PancakeMenu() {
        addMenuItem(0, "jam pancake", "pancake with jam", 2.45d);
        addMenuItem(1, "meat pancake", "pancake with meat", 2.75d);
        addMenuItem(2, "sour cream pancake", "pancake with sour cream", 1.85d);
    }

    public void addMenuItem(int position, String name, String description, double price) {
        pancakes[position] = new MenuItem(name, description, price);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new PancakeIterator(pancakes);
    }
}
