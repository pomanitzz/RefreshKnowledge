package theme.patterns.structural.bridge;

public class SmallCircleDrawer implements Drawer {
    @Override
    public String drawCircle(int x, int y, int radius) {
        return String.format("small %d %d %d", x, y, radius);
    }
}
