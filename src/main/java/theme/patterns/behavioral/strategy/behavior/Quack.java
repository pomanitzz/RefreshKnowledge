package theme.patterns.behavioral.strategy.behavior;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
