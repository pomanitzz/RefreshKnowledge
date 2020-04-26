package theme.patterns.structural.bridge;

public class LargeCircleDrawer implements Drawer {
    @Override
    public String drawCircle(int x, int y, int radius) {
        return String.format("large %d %d %d", x, y, radius);
    }
}
