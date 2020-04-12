package theme.patterns.behavioral.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return  "Can't fly!";
    }
}
