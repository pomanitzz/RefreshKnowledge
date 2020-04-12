package theme.patterns.behavioural.strategy.behavior;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
