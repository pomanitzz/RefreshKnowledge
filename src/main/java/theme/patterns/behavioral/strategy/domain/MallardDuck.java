package theme.patterns.behavioral.strategy.domain;

import theme.patterns.behavioral.strategy.behavior.FlyWithWings;
import theme.patterns.behavioral.strategy.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public String display() {
        return "Mallard Duck!";
    }
}
