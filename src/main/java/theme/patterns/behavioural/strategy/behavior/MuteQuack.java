package theme.patterns.behavioural.strategy.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "Silence";
    }
}
