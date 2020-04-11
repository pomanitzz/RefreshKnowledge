package theme.patterns.structural.decorator.coffee;

public abstract class Beverage {
    public enum Size {
        TALL,
        GRANDE,
        VENTI
    }

    private Size size;

    private String description;

    public Beverage() {
        this.description = "Unknown beverage";
        this.size = Size.TALL;
    }

    public abstract double getCost();

    public String getDescription() {
        return description;
    }

    public Beverage setDescription(String description) {
        this.description = description;
        return this;
    }

    public Size getSize() {
        return size;
    }

    public Beverage setSize(Size size) {
        this.size = size;
        return this;
    }
}
