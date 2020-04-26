package theme.patterns.structural.bridge;

public abstract class Shape {
    private Drawer drawer;

    public Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public abstract String draw();
}
