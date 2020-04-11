package theme.patterns.behavioural.strategy.domain;

import theme.patterns.behavioural.strategy.behavior.FlyWithWings;
import theme.patterns.behavioural.strategy.behavior.Quack;

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
