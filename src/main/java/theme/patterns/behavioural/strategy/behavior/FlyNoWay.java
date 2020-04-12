package theme.patterns.behavioural.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return  "Can't fly!";
    }
}
