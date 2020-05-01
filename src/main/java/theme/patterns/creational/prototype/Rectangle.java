package theme.patterns.creational.prototype;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    String draw() {
        return type;
    }
}
