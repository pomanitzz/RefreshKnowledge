package theme.patterns.creational.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    String draw() {
        return type;
    }
}
