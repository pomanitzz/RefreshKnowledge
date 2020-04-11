package theme.patterns.behavioural.strategy.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
