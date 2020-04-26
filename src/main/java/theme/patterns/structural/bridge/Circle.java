package theme.patterns.structural.bridge;

public class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    public Circle(Drawer drawer, int x, int y, int radius) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String draw() {
        return getDrawer().drawCircle(x, y, radius);
    }
}
