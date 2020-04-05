package theme.patterns.strategy.domain;

import theme.patterns.strategy.behavior.FlyWithWings;
import theme.patterns.strategy.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck!");
    }
}
