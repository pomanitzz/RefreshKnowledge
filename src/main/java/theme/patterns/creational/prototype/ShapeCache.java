package theme.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeCacheMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeCacheMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeCacheMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeCacheMap.put(rectangle.getId(), rectangle);
    }
}
